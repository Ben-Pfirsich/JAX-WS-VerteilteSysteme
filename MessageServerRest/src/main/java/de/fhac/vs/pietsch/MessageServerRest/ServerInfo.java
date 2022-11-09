package de.fhac.vs.pietsch.MessageServerRest;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;

@Component
@XmlRootElement
public class ServerInfo {
    public String server;

    public ServerInfo(){
        this.server = System.getProperty("os.name");
    }

}
