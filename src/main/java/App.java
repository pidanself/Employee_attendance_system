import java.net.URI;

import org.glassfish.jersey.jetty.JettyHttpContainerFactory;

import com.ustb.rest.RestApplication;


//部署失败！！！！！！！！！！！！！！！！！！！！！！！！！
public class App {

public static void main(String[] args) {
    JettyHttpContainerFactory.createServer(URI.create("http://localhost:8082/"), new RestApplication());
}
}