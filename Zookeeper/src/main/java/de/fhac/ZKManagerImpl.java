package de.fhac;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class ZKManagerImpl {
    private static ZooKeeper zk;
    private static ZKConnection zkConnection;

    public ZKManagerImpl() throws IOException, InterruptedException {
        initialize();
    }

    private void initialize() throws IOException, InterruptedException {
        zkConnection = new ZKConnection();
        zk = zkConnection.connect("localhost");
    }

    public void closeConnection() throws InterruptedException {
        zkConnection.close();
    }

    public void create(String path, byte[] data)
            throws KeeperException,
            InterruptedException {

        zk.create(
                path,
                data,
                ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT);
    }

    public Object getZNodeData(String path)
            throws KeeperException,
            InterruptedException, UnsupportedEncodingException {

        byte[] b = null;
        b = zk.getData(path, null, null);
        return new String(b, StandardCharsets.UTF_8);
    }

    public void update(String path, byte[] data) throws KeeperException,
            InterruptedException {
        int version = zk.exists(path, true).getVersion();
        zk.setData(path, data, version);
    }

    public void delete(String path) throws InterruptedException, KeeperException {
        int version = zk.exists(path, true).getVersion();
        zk.delete(path, version);
    }

//    public void list(){
//        zk.get
//    }
}
