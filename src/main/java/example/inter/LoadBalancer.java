//Charles Shwab
package example.inter;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

interface Server {
    // unique ID of server
    public String getId();

    // current number of connections to this server
    // public int getUsedConnections();

    // the maximum number of connections this server can handle
    // public int getTotalConnections();

    // Load calculated by the server
    // 0.0 (completely free) -> 1.0 (completely loaded)
    public float calculateLoad();

    // making the connecting
    public Connection acquireConnection();

    // releasing the connection
    public void releaseConnection(Connection c);
}

class ServerImpl implements Server {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public float calculateLoad() {
        return 0;
    }

    @Override
    public Connection acquireConnection() {
        return null;
    }

    @Override
    public void releaseConnection(Connection c) {

    }
}

class Connection {

}
// A - 2 / 10
// B - 3 / 5
// C - 1 / 10

public class LoadBalancer {

    private List<Server> servers;

    public LoadBalancer(List<Server> servers) {

        this.servers = servers;
    }

    public Connection acquireConnectionFromLeastLoadedServer() {
        AtomicReference<Float> load1 = new AtomicReference<>(null);

        Optional<Server> first = servers.stream().filter(s -> {
            if (load1 != null) {
                load1.set(s.calculateLoad());
            }
            if (load1 != null && s.calculateLoad() < load1.get()) {
                load1.set(s.calculateLoad());
                return true;
            }
            return false;
        }).findFirst();

        return first.get().acquireConnection();
    }
}