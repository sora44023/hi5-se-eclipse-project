package guitest;

import java.util.Random;
import processing.core.*;

public class PAppletTest1 extends PApplet {

	int x;
	int y;
	Random rnd;

	public void settings() {
		// 設定
		size(600, 600); // windowのサイズ
		rnd = new Random();
	}

	public void setup() {
		// セットアップ（最初に1回だけ実行）
		background(220, 220, 220); // 背景色 (RGB)
		stroke(255, 255, 255); // 図形の枠線の色
	}

	public void mouseMoved() {
		// マウスが動いたとき，マウスの座標をx, yにセット
		x = mouseX;
		y = mouseY;
	}

	public void draw() {
		// 常時繰り返し行われる処理
		fill(0, 0, 0); // 図形を塗りつぶす色を黒に
		ellipse(x, y, 4, 4); // 円を描く
	}

	public void mousePressed() {
		// マウスボタンが押されたとき
		fill(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)); // 図形を塗りつぶす色をランダムにセット
		ellipse(x, y, 50, 50); // 円を描く
	}

	public static void main(String[] args) {
		String[] a = { "main" };
		PApplet.runSketch(a, new PAppletTest1());
	}

}
