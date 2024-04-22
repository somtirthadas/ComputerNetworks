import java.net.*;
import java.io.*;
public class BasicClient {
    public static void main(String[] args){
        try{
            Socket clisc = new Socket("localhost",3000);
            System.out.println("*****Find Server*****");
        }
        catch (Exception e){
            
        }
    }
}
