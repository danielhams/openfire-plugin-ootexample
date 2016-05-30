package example;

import java.io.File;

import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExamplePlugin implements Plugin
{
    private final static Logger LOG = LoggerFactory.getLogger( ExamplePlugin.class );

    public static final String PLUGIN_NAME = "example";

    private final ExampleLib exampleLib = new ExampleLib();

    @Override
    public void initializePlugin( final PluginManager manager, final File pluginDirectory )
    {
        LOG.info( "ExamplePlugin initialize" );
    }

    @Override
    public void destroyPlugin()
    {
        LOG.info( "ExamplePlugin destroy" );
    }

    public String getPluginString()
    {
        return "Hello, this is the ExamplePlugin. The library says '" + exampleLib.getLibString() + "'";
    }
}
