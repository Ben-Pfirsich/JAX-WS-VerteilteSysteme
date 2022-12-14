package de.fhac;

import org.apache.zookeeper.*;
import org.apache.zookeeper.server.DumbWatcher;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {

        ZKManagerImpl zkManager = new ZKManagerImpl();


//        zkManager.create("/new_node", "fool_data".getBytes());
        System.out.println(zkManager.getZNodeData("/new_node"));
//        zkManager.update("/new_node", "Willi".getBytes());
//        System.out.println(zkManager.getZNodeData("/new_node"));
//
//        System.out.println(zkManager.getZNodeData("/fool"));

//        zkManager.delete("/fool");



    }
}
