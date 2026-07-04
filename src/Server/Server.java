package Server;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Server {
    private final HttpServer server;

    public Server(String host, int port) throws IOException {
        this.server = HttpServer.create(new InetSocketAddress(host, port), 0);
        this.server.createContext("/", exchange -> {
            String response = "Server is running";
            exchange.sendResponseHeaders(200, response.length());
            var os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });
    }

    public void start() {
        this.server.start();
    }
}