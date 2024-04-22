import java.net.*;
import java.io.*;
public class BasicServer {
    public static void main(String[] args) {
        try{
            System.out.println("Waitig for client.....");
            ServerSocket serv = new ServerSocket(3000);
            Socket sc = serv.accept();
        }
        catch(Exception e){
            
        }
    }
}
