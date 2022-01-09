import java.io.InputStream;
import java.io.OutputStream;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class JavaPoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			SSLSocket sslsocket = (SSLSocket) sslsocketfactory.createSocket("https://dev.wm.bbmapfre.com.br", Integer.parseInt("443"));

			InputStream in = sslsocket.getInputStream();
			OutputStream out = sslsocket.getOutputStream();

			// Write a test byte to get a reaction :)
			out.write(1);

			while (in.available() > 0) {
				System.out.print(in.read());
			}
			System.out.println("Successfully connected");

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
