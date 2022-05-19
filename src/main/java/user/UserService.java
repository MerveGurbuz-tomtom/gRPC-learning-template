package user;

import java.util.HashMap;
import java.util.Map;

import com.tutorial.UserService.APIResponse;
import com.tutorial.UserService.Empty;
import com.tutorial.UserService.LoginRequest;
import com.tutorial.UserService.UserPro;
import com.tutorial.userGrpc.userImplBase;
import io.grpc.stub.StreamObserver;
public class UserService extends userImplBase {

  @Override
  public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
    System.out.println("loging in");
    String username= request.getUsername();
    String password= request.getPassword();
    APIResponse.Builder response = APIResponse.newBuilder();
    if( username.equals("merve")){
      response.setResponsemessage("success");
      response.setResponseCode(200);
    }
    else{
      response.setResponsemessage("fail");
      response.setResponseCode(400);
    }
    responseObserver.onNext(response.build());
    responseObserver.onCompleted();
  }

  @Override
  public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
    APIResponse.Builder response = APIResponse.newBuilder();
    
      response.setResponsemessage("success");
      response.setResponseCode(200);
      responseObserver.onNext(response.build());
      responseObserver.onCompleted();

  }
  @Override
  public void listUsers(Empty request, StreamObserver<APIResponse> responseObserver){
    APIResponse.Builder response = APIResponse.newBuilder();
    for (int i = 0; i < 4; i++) {
      response.setResponseCode(200).setResponsemessage("success");
      UserPro user = UserPro.newBuilder().setUsername("merve").setPassword("deneme").build();
      response.addUserList(user);
      responseObserver.onNext(response.build()); 
    }
    responseObserver.onCompleted();
  }
  
  @Override
  public StreamObserver<UserPro> recordUsers(StreamObserver<APIResponse> response  ) {
    Map<String,String> userList= new HashMap<String,String>();
    
      return new StreamObserver<UserPro>() {
        
        
        @Override
        public void onNext(UserPro value) {
          
          userList.put(value.getUsername(),value.getPassword());
        }

        @Override
        public void onError(Throwable t) {
         System.out.println("error occured");
          
        }

        @Override
        public void onCompleted() {
         response.onNext(APIResponse.newBuilder().setResponseCode(200).setResponsemessage("succes").build());
          response.onCompleted();
        }

        
      };
    
  }
}
