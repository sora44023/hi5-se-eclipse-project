package com;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static final int PORT_NUM = 55506;

	public static void main(String args[]) {
		ServerSocket ssock;
		try {
			ssock = new ServerSocket(PORT_NUM);
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
