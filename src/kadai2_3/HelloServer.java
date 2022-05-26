package kadai2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
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
				System.out.println("Connected: Client No. " + count + " ("
						+ sock.getInetAddress().getHostName() + ").");
				BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream())); // 入力
				PrintWriter out = new PrintWriter(sock.getOutputStream(), true); // 出力

				out.println();
				out.println("Hi, you are Client No. " + count + ".");
				while (true) {
					out.println("What's your name?");
					String name = in.readLine(); // 一行入力を受け取る
					if (name.equals("bye"))
						break;
					out.println("Hello, " + name + "!");
				}
				in.close();
				out.close();
				sock.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
