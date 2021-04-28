package example.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Receiver {

  @JmsListener(destination = "mytopic1", containerFactory = "myFactory")
  public void receiveMessage(HashMap<String,String> msg) {
    System.out.println("[LOG] Received <" + msg + ">");
  }

}
