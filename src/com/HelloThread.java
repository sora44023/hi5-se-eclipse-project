package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HelloThread implements Runnable{
	int count;
	Socket sock;

	public HelloThread(Socket sock, int count) {
		this.sock = sock;
		this.count = count;
	}

	public void run() {
		try {
			System.out.println("Connected: Client No. " + count + " (" + sock.getInetAddress().getHostName() + ").");
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
