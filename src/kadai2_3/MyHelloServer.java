package kadai2_3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyHelloServer {
	public static final int PORT_NUM = 55500; // ポート番号
	// 注: gardenなどHI科演習サーバで実行する場合，末尾2桁を自分の出席番号に設定しよう

	public static void main(String args[]) {
		ServerSocket ssock;
		try {
			ssock = new ServerSocket(PORT_NUM); // サーバ用ソケット生成
			int count = 0; // クライアント番号
			while (true) {
				// 接続を待つ
				System.out.println("Waiting for connection on Port " + PORT_NUM + " ..");
				Socket sock = ssock.accept();

				// 接続されたときの処理
				count++;
				new Thread(new HelloThread(sock, count)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}