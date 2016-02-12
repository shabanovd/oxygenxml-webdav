package animo.oxygenxml.webdav;

import ro.sync.exml.plugin.urlstreamhandler.URLStreamHandlerPluginExtension;

import java.net.URLStreamHandler;

/**
 * @author <a href="mailto:shabanovd@gmail.com">Dmitriy Shabanov</a>
 */
public class URLHandler implements URLStreamHandlerPluginExtension {

    public static final String WEBDAV = "webdav";
    public static final String WEBDAVS = "webdavs";

    @Override
    public URLStreamHandler getURLStreamHandler(String protocol) {
        if (WEBDAV.equals(protocol) || WEBDAVS.equals(protocol)) {
            return new WebDAV_Handler();
        }

        return null;
    }
}
