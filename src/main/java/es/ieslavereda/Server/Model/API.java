package es.ieslavereda.Server.Model;

import es.ieslavereda.Properties.MyConfig;

public class API {

    public static class Routes {
        public static final String SERVER_BASE = "http://" + MyConfig.getInstance().getOracleDBHost() + ":" + MyConfig.getInstance().getOracleDBPort();
        public static final String EMPLEADO = "/employee";
        public static final String VEHICLES = "/vehicles";
    }

    public static class Type {
        public static final String JSON = "application/json";
        public static final String TEXT_XML = "text/xml";
        public static final String TEXT_HTML = "text/html";
    }
}
