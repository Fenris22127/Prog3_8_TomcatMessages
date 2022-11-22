module Aufgabe06.Server.main {
    requires org.apache.tomcat.embed.jasper;
    requires org.apache.tomcat.embed.websocket;
    requires org.apache.tomcat.embed.core;
    requires org.apache.tomcat.embed.el;
    requires java.desktop;
    requires java.instrument;
    requires Aufgabe06.Message.main;
    exports de.medieninformatik.Server;
}