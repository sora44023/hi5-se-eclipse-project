package kadai7;

import processing.core.*;
import java.nio.file.Paths;

public class GUIMain extends PApplet {
	private CardSet cardSet = new CardSet(2); // カードセット．各スートを2セット（8枚）
	private PImage[][] cardImages;  // 表面のカードイメージ
	private PImage cardBackImage;   // 裏面のカードイメージ

	// 各種定数
	static final int CARD_COUNT = 8;
	static final int CARD_HEIGHT = 150, CARD_WIDTH = 100;
	static final int CARD_AREA_LEFT = 80, CARD_AREA_TOP = 80;
	static final String PATH_IMAGE = "cardimg"; // 画像があるのはプロジェクトのルート直下のcardimgディレクトリ
	
	@Override
	public void settings() {
		// 設定
		size(1000, 300); // windowのサイズ
	}
	
	@Override
	public void setup() {
		// セットアップ（最初に1回だけ実行される）
		// カード裏面（1枚）の画像ファイルをcardBackImageに読み込み
		cardBackImage = loadImage(Paths.get(PATH_IMAGE, "back1.png").toString());
		cardBackImage.resize(CARD_WIDTH, CARD_HEIGHT);
		// カード表面（4×13枚）の画像ファイルをcardImagesに読み込み
		// cardImage[Suitの値][番号-1]に格納する
		cardImages = new PImage[Card.Suit.values().length][13];
		for (Card.Suit suit: Card.Suit.values()) {
			for (int i = 0; i < 13; i++) {
				String[] numstrs = {"A", "2", "3", "4", "5", "6", "7", "8",
						"9", "10", "J", "Q", "K"};
				cardImages[suit.ordinal()][i] = loadImage(Paths.get(PATH_IMAGE, 
					numstrs[i] + suit.toString().charAt(0) + ".png").toString());		
				cardImages[suit.ordinal()][i].resize(CARD_WIDTH, CARD_HEIGHT);
			}
		}	
		refresh();
	}
	private PImage getCardImage(Card c) {
		// 与えられたCardオブジェクトに該当するcardImages内のイメージを返す
		return cardImages[c.getSuit().ordinal()][c.getNumber()-1];
	}
	public void refresh() {
		// CardSetに応じてカードを描画する
		clear(); // ウィンドウのクリア
		background(30, 80, 30); // 背景色 (RGB)

		// カードの描画
		for (int i = 0; i < CARD_COUNT; i++) {
			Card c = cardSet.get(i);
			if (c.getState() == Card.CardState.TAKEN)
				continue;
			PImage pimage = null;
			if (c.getState() == Card.CardState.FRONT)
				pimage = getCardImage(c);
			else if (c.getState() == Card.CardState.BACK)
				pimage = cardBackImage;
			image(pimage, CARD_AREA_LEFT + CARD_WIDTH * i, CARD_AREA_TOP);
		}	

		// テキストの描画
		fill(255); // テキストの色
		textSize(20); // テキストのサイズ
		text("Left: " + cardSet.getLeftCount(), 50, 50);
	}

	@Override
	public void draw() {
		// 常時繰り返し行われる処理
	}

	@Override
	public void mousePressed() {
		// マウスボタンが押されたとき（マウスの座標はmouseXとmouseYで参照可能）
		if(mouseX >= CARD_AREA_LEFT && mouseX <= CARD_AREA_LEFT + CARD_WIDTH * CARD_COUNT
			&&	mouseY >= CARD_AREA_TOP && mouseY <= CARD_AREA_TOP + CARD_HEIGHT) {
			// カードのエリア内であれば，何番目のカードが押されたかをnumに取得
			int num = (mouseX - CARD_AREA_LEFT) / CARD_WIDTH;
			Card c = cardSet.get(num);
			// 裏であれば表に，表であればtakeする
			if (c.getState() == Card.CardState.BACK)
				c.flipUp();
			else if (c.getState() == Card.CardState.FRONT)
				c.take();			
			refresh();
		}
	}

	public static void main(String[] args) {
		String[] runArgs = {"main"};
		PApplet.runSketch(runArgs, new GUIMain());
	}

}
