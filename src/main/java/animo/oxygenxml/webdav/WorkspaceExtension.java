package animo.oxygenxml.webdav;

import ro.sync.exml.plugin.workspace.WorkspaceAccessPluginExtension;
import ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author <a href="mailto:shabanovd@gmail.com">Dmitriy Shabanov</a>
 */
public class WorkspaceExtension implements WorkspaceAccessPluginExtension {

    static Thread delayThread;

    static List<URL> openWhenReady = new ArrayList<>();
    public static void openWhenReady(URL uri) {
        openWhenReady.add(uri);

        if (delayThread == null && ws != null)
            doOpen();
    }

    static StandalonePluginWorkspace ws;

    @Override
    public void applicationStarted(StandalonePluginWorkspace ws) {
        WorkspaceExtension.ws = ws;

        //workaround
        delayThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                doOpen();
            } catch (InterruptedException e) {
                //ignore
            } finally {
                delayThread = null;
            }
        });
        delayThread.setDaemon(true);
        delayThread.start();
    }

    private static void doOpen() {
        Iterator<URL> it = openWhenReady.iterator();
        while (it.hasNext()) {
            URL url = it.next();
            ws.open(url);
            it.remove();
        }
    }

    @Override
    public boolean applicationClosing() {
        return true;
    }
}
