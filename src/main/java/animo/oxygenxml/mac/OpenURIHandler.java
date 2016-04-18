package animo.oxygenxml.mac;

import animo.oxygenxml.webdav.WorkspaceExtension;
import com.apple.eawt.AppEvent;

import java.io.File;
import java.net.MalformedURLException;

/**
 * @author <a href="mailto:shabanovd@gmail.com">Dmitriy Shabanov</a>
 */
public class OpenURIHandler implements com.apple.eawt.OpenURIHandler, com.apple.eawt.OpenFilesHandler {

    OpenURIHandler() {
        final com.apple.eawt.Application app = com.apple.eawt.Application.getApplication();
        app.setOpenURIHandler(this);
        app.setOpenFileHandler(this);
    }

    @Override
    public void openURI(AppEvent.OpenURIEvent openURIEvent) {
        try {
            WorkspaceExtension.openWhenReady(openURIEvent.getURI().toURL());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void openFiles(AppEvent.OpenFilesEvent openFilesEvent) {
        for (File file : openFilesEvent.getFiles()) {
            try {
                WorkspaceExtension.openWhenReady(file.toURI().toURL());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
