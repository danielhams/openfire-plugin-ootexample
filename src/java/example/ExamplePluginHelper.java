package example;

import org.jivesoftware.openfire.XMPPServer;
import org.jivesoftware.openfire.container.PluginManager;

public class ExamplePluginHelper
{
    private final ExamplePlugin pluginRef;

    public ExamplePluginHelper()
    {
        final XMPPServer xmppServer = XMPPServer.getInstance();
        final PluginManager pluginManager = xmppServer.getPluginManager();
        pluginRef = (ExamplePlugin) pluginManager.getPlugin( ExamplePlugin.PLUGIN_NAME );
    }

    public String getPluginString()
    {
        return pluginRef.getPluginString();
    }
}
