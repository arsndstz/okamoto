package curriculum_B;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Qes1_3 {

	public static void main(String[] args) {

// 問1 ログイン時の入力チェックシステムを下記条件で作成してください
		// ・コンソールにユーザー名を入力できるようにしてください
		// ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		// ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		// ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
// 問2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		
		String str;
		int num;
		Matcher m;
		boolean flag;
		
		do {
			flag = true;
			System.out.println("ユーザー名を入力してください");
			Scanner scan = new Scanner(System.in);
			str = scan.next();
			num = str.length();
        
			Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
			m = p.matcher(str);
        
		 
        // nullの場合
			if(Objects.isNull(str)) {
				System.out.println("名前を入力してください");
				flag = false;
				return;
			}        

		// 0文字以下の場合
			else if(str.isEmpty()) {
				System.out.println("名前を入力してください");
				flag = false;
			}
		
	     // 10文字以上の場合
			else if(num > 10) {
				System.out.println("名前を10文字以内にしてください");
				flag = false;
			}

        // 半角英数字以外の場合
			else if(!m.find()) {
				System.out.println("半角英数字のみで名前を入力してください");
				flag = false;
			}
        
        // 正常な値だった場合
			else {
				System.out.println("ユーザー名「"+ str + "」を登録しました");
				flag = true;
			}
        
			System.out.println("\n");
		}
		// ユーザー名が正常でなければ繰り返す
		while(flag == false);
        
        
        
// 問3 じゃんけんのシステムを下記の条件で作成してください
// ・「0はグー、1：チョキ、2：パー」とすること
// ・じゃんけんに勝つまでループすること
// ・一回ごとに自分の手と相手の手を下記の通り出力してください
        // ユーザー名「name」を登録しました
        // nameの手は「パー」
        // 相手の手は「グー」

		// ・条件分岐の設定
        // ・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
        // やるやん。
        // 次は俺にリベンジさせて
        
        // ・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
        // 俺の勝ち！
        // 負けは次につながるチャンスです！
        // ネバーギブアップ！
        
        // ・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
        // 俺の勝ち！
        // たかがじゃんけん、そう思ってないですか？
        // それやったら次も、俺が勝ちますよ
        
        // ・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
        // 俺の勝ち！
        // なんで負けたか、明日まで考えといてください。
        // そしたら何かが見えてくるはずです
        
        // ・あいこの場合、下記が出力されるようにしてください
        // DRAW あいこ もう一回しましょう！
        
        
// じゃんけんを行った回数を表示してください
        // 例：勝つまでにかかった合計回数は1回です
        
        
// ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください
		
		
		
		int userHand;
		int pcHand;
		int count = 0;
		
		do {
			flag = true;
			// コンピューターの手をランダムで決める
			pcHand = (int)Math.floor( Math.random() * 3 );
	
		do {
			flag = true;
			System.out.println("何を出しますか？（ 0:グー / 1:チョキ / 2:パー ）:");

			Scanner scanner = new Scanner(System.in);

			String playerHand = scanner.next();

			userHand = Integer.parseInt(playerHand);
			
			// 入力された文字が0,1,2以外の場合
			if (userHand != 0 && userHand != 1 && userHand != 2) {
			System.out.println("出した手がおかしいです...");
			flag = false;
			
			System.out.println("\n");
			}
		}		
		// 入力がおかしい場合は繰り返す
		while(flag == false);
		
		
		// ユーザーの手を出力
		if(userHand == 0) {
			System.out.println(str + "の手は「グー」");
			
	        }else if(userHand == 1) {
	        	System.out.println(str + "の手は「チョキ」");
	        	
	        }else if(userHand == 2) {
	        	System.out.println(str + "の手は「パー」");
	        }
		
		// コンピューターの手を出力
		if(pcHand == 0) {
			System.out.println("相手の手は「グー」");
			
			}else if(pcHand == 1) {
				System.out.println("相手の手は「チョキ」");
				
			}else if(pcHand == 2) {
				System.out.println("相手の手は「パー」");
			}
		
		System.out.println("\n");
		
		// あいこの場合
		if(userHand == pcHand) {
			System.out.println("DRAW あいこ もう一回しましょう！");
			count++;
			flag = false;
			
			// ユーザーがグーで負けた場合
			}else if(userHand == 0 && pcHand == 2) {
				System.out.println("俺の勝ち！\n"+"負けは次につながるチャンスです！\n"+"ネバーギブアップ！");
				count++;
				flag = false;
				
			// ユーザーがチョキで負けた場合
			}else if(userHand == 1 && pcHand == 0) {
				System.out.println("俺の勝ち！\n"+ "たかがじゃんけん、そう思ってないですか？\n"+ "それやったら次も、俺が勝ちますよ");
				count++;
				flag = false;
				
			// ユーザーがパーで負けた場合
			}else if(userHand == 2 && pcHand == 1) {
				System.out.println("俺の勝ち！\n"+"なんで負けたか、明日まで考えといてください。\n"+"そしたら何かが見えてくるはずです");
				count++;
				flag = false;
				
			// ユーザーが勝った場合
			}else {
				System.out.println("やるやん。\n"+"次は俺にリベンジさせて");
				count++;
				flag = true;
			}
		
		System.out.println("\n");
		
		}
		
		// あいこと負けた場合は繰り返す
		while(flag == false);
		
		// 勝つまでにかかった回数を出力
		System.out.println("勝つまでにかかった合計回数は" + count+ "回です");
		
		
	}
}


