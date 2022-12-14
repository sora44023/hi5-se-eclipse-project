package guitest;

import java.nio.file.Paths;
import java.util.Random;
import processing.core.*;

public class PAppletCards extends PApplet {
	int x;
	int y;
	Random rnd;
	PImage img_back;
	PImage[] img_cards;
	final int CARD_HEIGHT = 150;
	final int CARD_WIDTH = 100;
	final int CARD_AREA_LEFT = 40;
	final int CARD_AREA_TOP = 40;
	final int CARD_COUNT = 4;
	static final String PATH_IMAGE = "cardimg"; // 画像があるのはsrc直下のcardimgディレクトリ

	public void settings() {
		// 設定
		size(600, 300); // windowのサイズ
		rnd = new Random();
	}

	public void setup() {
		// セットアップ（最初に1回だけ実行）
		background(220, 220, 220); // 背景色 (RGB)
		stroke(255, 255, 255); // 図形の枠線の色
		img_back = loadImage(Paths.get(PATH_IMAGE, "back1.png").toString());
		img_back.resize(CARD_WIDTH, CARD_HEIGHT);
		img_cards = new PImage[CARD_COUNT];
		// とりあえずのテスト用に・・
		img_cards[0] = loadImage(Paths.get(PATH_IMAGE, "AS.png").toString());
		img_cards[1] = loadImage(Paths.get(PATH_IMAGE, "AH.png").toString());
		img_cards[2] = loadImage(Paths.get(PATH_IMAGE, "AD.png").toString());
		img_cards[3] = loadImage(Paths.get(PATH_IMAGE, "AC.png").toString());

		for (int i = 0; i < CARD_COUNT; i++)
			img_cards[i].resize(CARD_WIDTH, CARD_HEIGHT);

		for (int i = 0; i < CARD_COUNT; i++)
			image(img_back, CARD_AREA_LEFT + CARD_WIDTH * i, CARD_AREA_TOP);
	}

	public void mouseMoved() {
		// マウスが動いたとき，マウスの座標をx, yにセット
		x = mouseX;
		y = mouseY;
	}

	public void draw() {
		// 常時繰り返し行われる処理
	}

	public void mousePressed() {
		// マウスボタンが押されたとき
		if (x >= CARD_AREA_LEFT && x <= CARD_AREA_LEFT + CARD_WIDTH * CARD_COUNT && y >= CARD_AREA_TOP
				&& y <= CARD_AREA_TOP + CARD_HEIGHT) {
			int n = (x - CARD_AREA_LEFT) / CARD_WIDTH;
			image(img_cards[n], CARD_AREA_LEFT + CARD_WIDTH * n, CARD_AREA_TOP);
		}
	}

	public static void main(String[] args) {
		String[] a = { "main" };
		PApplet.runSketch(a, new PAppletCards());
	}

}