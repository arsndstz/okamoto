package curriculum_B;

import java.util.Scanner;

public class Qes_6 {
	
	public static void main(String[] args) {

// 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
// ・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
// ・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
// ・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
// ・入力された値は「、」区切りで指定してください
// ・そのほかの値が入力された場合下記を出力されるようにしてください
//   『受け取った値』は指定の商品ではありません
// ・残り台数は0〜11までのランダムな値が出力されるようにしてください
	
// 入力例↓↓
//	パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品
	
// 出力例↓↓
//	パソコンの残り台数は8台です
//	冷蔵庫の残り台数は7台です
//	扇風機の残り台数は7台です
//	洗濯機の残り台数は10台です
//	加湿器の残り台数は3台です
//	テレビの残り台数は9台です
//	ディスプレイの残り台数は2台です
//	『 その他商品 』は指定の商品ではありません
	
	
	

	Scanner scanner = new Scanner(System.in);
	String strInput = scanner.nextLine();
// 「、」ごとに区切る
	String[] strSplit = strInput.split("、");
	
	
	for (String str: strSplit) {
		// 残りの台数をランダムで決める
		int remaining = (int)Math.floor( Math.random() * 12 );
		System.out.println("\n");
		
		switch(str) {
		case "パソコン":
			System.out.println("パソコンの残り台数は" + remaining + "台です");
			break;
		case "冷蔵庫":
			System.out.println("冷蔵庫の残り台数は" + remaining + "台です");
			break;
		case "扇風機":
			System.out.println("扇風機の残り台数は" + remaining + "台です");
			break;
		case "洗濯機":
			System.out.println("洗濯機の残り台数は" + remaining + "台です");
			break;
		case "加湿器":
			System.out.println("加湿器の残り台数は" + remaining + "台です");
			break;
		case "テレビ":
			System.out.println("テレビの残り台数は" + remaining + "台です");
			break;
		case "ディスプレイ":
			System.out.println("ディスプレイの残り台数は" + remaining + "台です");
			break;
		default:
			System.out.println("『" + str + "』は指定の商品ではありません");
		}
	}	
	
	scanner.close();
	
	
	
	}
}
