package animo.oxygenxml.webdav;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author <a href="mailto:shabanovd@gmail.com">Dmitriy Shabanov</a>
 */
public class WebDAV_Handler extends ro.sync.net.protocol.http.Handler {

    public URLConnection openConnection(URL u) throws IOException {
        URL url = new URL("http" + u.toString().substring(6));
        return super.openConnection(url);
    }
}
