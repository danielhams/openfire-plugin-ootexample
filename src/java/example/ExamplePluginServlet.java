package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExamplePluginServlet extends HttpServlet
{
    private static final long serialVersionUID = 8977844342407174401L;

    private final static Logger LOG = LoggerFactory.getLogger( ExamplePluginServlet.class );

    @Override
    protected void doGet( final HttpServletRequest req, final HttpServletResponse resp ) throws ServletException, IOException
    {
        LOG.info("ExampleServlet servicing request.");

        resp.setContentType( "text/plain" );
        final PrintWriter pw = resp.getWriter();

        try
        {
            pw.write( "Please enjoy the nuts" );
            resp.setStatus( HttpServletResponse.SC_OK );
        }
        finally
        {
            pw.close();
        }
    }

    @Override
    protected void doPost( final HttpServletRequest req, final HttpServletResponse resp ) throws ServletException, IOException
    {
        doGet( req, resp );
    }

    @Override
    public void destroy()
    {
        LOG.info( "ExampleServlet destroy" );
    }

    @Override
    public void init( final ServletConfig config ) throws ServletException
    {
        LOG.info( "ExampleServlet init");
    }

}
