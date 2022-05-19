import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import user.UserService;

public class GRPCServer {
  private int port;
  private static Server server;

  public GRPCServer (int port) throws IOException{
    this.port=port;
    this.server= ServerBuilder.forPort(port).addService(new UserService()).build();
  }
  public void start()  throws IOException, InterruptedException{
    server.start();
    System.out.println("server has start on port "+server.getPort());
    server.awaitTermination();
  }



  public static void main(String[] args) throws IOException, InterruptedException {
     GRPCServer server = new GRPCServer(9090);
     server.start();
     GRPCServer.server.awaitTermination();
  }
}
