<%@ page import="example.*"%>

<%
    ExamplePluginHelper helper = new ExamplePluginHelper();
    String pluginString = helper.getPluginString();
%>

<html>
    <head>
        <title>Example Page</title>
        <meta name="pageID" content="example-page"/>
    </head>
    <body>
        <h1>The example plugin says <%=pluginString%>!</h1>
    </body>
</html>
