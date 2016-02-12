package animo.oxygenxml.webdav;

import animo.oxygenxml.mac.Macs;
import ro.sync.exml.plugin.PluginDescriptor;

/**
 * @author <a href="mailto:shabanovd@gmail.com">Dmitriy Shabanov</a>
 */
public class Plugin extends ro.sync.exml.plugin.Plugin {

    private static Plugin instance = null;
    public static Plugin get() {
        return instance;
    }

    public Plugin(PluginDescriptor descriptor) {
        super(descriptor);

        Macs.register();
    }
}
