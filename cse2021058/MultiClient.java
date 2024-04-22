import java.io.*;
import java.net.*;
class MultiClient {
    public static void main(String[] args) throws Exception {
        Socket sock = new Socket("127.0.0.1",4000);

        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);
        
        InputStream istream = sock.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

        System.out.println("Start the chat, type and press enter key");
        String receiverMessage, sendMessage;

        while(true){
            sendMessage = keyRead.readLine();
            pwrite.println(sendMessage);
            pwrite.flush();
            if((receiverMessage = receiveRead.readLine()) != null)
                System.out.println(receiverMessage);
        }
    }
}

