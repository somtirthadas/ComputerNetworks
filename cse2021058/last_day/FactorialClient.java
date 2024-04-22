import java.net.*;
import java.io.*;
class FactorialClient{
    public static void main(String[] args){
        try{
            System.out.println("Client started ....");
            Socket sc = new Socket("localhost", 3000);
            BufferedReader ui = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number : ");
            String number = ui.readLine();

            PrintStream pwc = new PrintStream(sc.getOutputStream(), true);
            pwc.println(number);
            System.out.println("Send Number to server..");

            BufferedReader brin = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            String sts = brin.readLine();
            System.out.println("Received factorial value from server ......");
            System.out.println("Factorial of " + number+" is : " + Integer.parseInt(sts));
            sc.close();
        }
        catch(Exception e){}
    }
}