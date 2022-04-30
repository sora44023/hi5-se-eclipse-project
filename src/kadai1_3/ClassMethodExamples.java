package kadai1_3;

import java.time.LocalDateTime;
import java.io.File;

public class ClassMethodExamples {
	public static void main(String[] args) {
        // (1)Mathのmaxメソッド
        // 2つの引数の数値のうち大きい方を返す．
        int a = 2;
        int b = 3;
        System.out.println("--- (1) ---");
        System.out.println(Math.max(a, b));	// 3が出力される
        
        // (2)LocalDateTimeのnowメソッド
        // 現在の日付・時間を取得
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println("\n--- (2) ---");
        System.out.println(nowDate);	// 実行時の日付・時間が出力される
        
        // (3)Fileのlistメソッド
        // 指定したディレクトリの一覧を得る
        File dir = new File("/Users");	// Usersディレクトリを指定
        String[] dirlist = dir.list();	// 指定したディレクトリの一覧をString型の配列に格納
        System.out.println("\n--- (3) ---");
        for(int i=0; i<dirlist.length; i++) {
        	System.out.println(dirlist[i]);	// 配列に格納されたファイル名が出力される
        }
        
	}
}
