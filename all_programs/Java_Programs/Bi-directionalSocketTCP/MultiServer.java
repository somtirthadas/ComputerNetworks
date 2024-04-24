import java.net.*;
import java.io.*;
class MultiServer{
    public static void main(String[] args) throws Exception {
        ServerSocket sersock = new ServerSocket(4000);
        System.out.println("Server Ready.");
        Socket sock = sersock.accept();
                            
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);

        InputStream istream = sock.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

        String receiverMessage, sendMessage;

        while(true){
            if((receiverMessage = receiveRead.readLine()) != null){
                System.out.println(receiverMessage);
            }
            sendMessage = keyRead.readLine();
            pwrite.println(sendMessage);
            pwrite.flush();
        }   
    }
}
