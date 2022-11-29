rete di pacchetti;

importare java.io.DataInputStream;
importare java.io.DataOutputStream;
importare java.net.ServerSocket;
importare java.net.Socket;


public class ServerConsVoc {

public static void main(String[] args) genera l'eccezione {
prova {
			
			int count=0;
			
			int vocali = 0;
			
consonanti int = 0;
			
Ascolta il porto
Server ServerSocket = nuovo ServerSocket(8698);
			System.out.println("Apertura del socket e attesa connessioni");
			Socket serverClientSocket = server.accept();
			
			DataInputStream inStream = new DataInputStream(serverClientSocket.getInputStream());
			DataOutputStream outStream = new DataOutputStream(serverClientSocket.getOutputStream());
			
			String clientMessage = "";
			
			while(!clientMessage.equals("end")) 
				{
		    clientMessage = inStream.readUTF();
		    
		    for(int i = 0; i < clientMessage.length(); i++)
		    {	 
		    	if (Character.isLetter(clientMessage.charAt(i)))
		    		count++;
			}
		    
		    for (int i = 0; i < clientMessage.length(); ++i)
		    {
		         char ch = clientMessage.charAt(i);
		         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		         {
		            vocali++;
		         }
altro
		         if ((ch >= 'a' && ch <= 'z'))
		         {
		            consonanti++;
		         }
		         
		    }
		       
			outStream.writeUTF("Server: " + clientMessage + " Lettere: " + count + "\nnumero consonanti : " + consonanti + "\nnumero vocali :" + vocali);
			
conteggio=0;
			
			outStream.flush();
			
se(consonanti==vocali)
	         {
	        	 clientMessage="end";
	         }
			
					}
			}
catch (eccezione e) {
			System.out.println(e);
		}
	}
		}
