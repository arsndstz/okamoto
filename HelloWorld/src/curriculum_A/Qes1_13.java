package curriculum_A;

public class Qes1_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	// 問題1 宣言のみをする
		byte by;
		short sh;
		int i;
		long lo;
		float f;
		double d;
		char c;
		String str;
		boolean b;
		
		
	// 問題2 初期値を代入し初期化する
		by = 0;
		sh = 0;
		i = 0;
		lo = 0;
		f = 0.0f;
		d = 0.0d;
		c = '\u0000';
		str = null;
		b = false;
		
		
	// 問題3 変数に値を代入する
		by = 10;
		sh = 100;
		i = 1000;
		lo = 10000;
		f = 9.5f;
		d = 10.5d;
		c = 'a';
		str = "ハロー";
		b = true;
		
		
	// 問題4 コンソールに出力する
		System.out.println(by+sh+i+lo);
		System.out.println(by+by);
		System.out.println(c+str+b);
		System.out.println(by+sh+i+lo+f+d);
		System.out.println(by*sh*i*lo);
		System.out.println(d/sh);
		System.out.println(by-sh);
		
		
	// 問題5 ハローJAVA2023ではなく、ハローJAVA43と表示する
	// 値を代入する
		byte num = 20;
		byte num1 = 23;
	// コンソールに出力する
		System.out.println("ハローJAVA"+(num+num1));
		
		
	// 問題6 formatの通りコンソールに出力する
	// 山田太郎 18歳 170.5cm 62.2kg 寿司 を変数に代入する
		String name = "山田太郎";
		byte age = 18;
		double height = 170.5d;
		double weight = 62.2d;
		String food = "寿司";
		
	// コンソールに出力する
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		
	// 問題7 山田太郎のBMIを計算し、コンソールに出力する
		double BMI = (weight/(height*height))*10000;
		// BMI=体重÷身長の2乗
		
		// 小数第一位までを表示する
		System.out.println("BMIは"+String.format("%.1f",BMI)+"です");
		
		
	// 問題8 変数に再代入する
		name = "鈴木一郎";
		age = 24;
		height = 168.5d;
		weight = 64.2d;
		food = "オムライス";
		BMI = (weight/(height*height))*10000;
		
	// コンソールに出力する
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("BMIは"+String.format("%.1f",BMI)+"です");
		
		
	// 問題9 年齢・身長・体重の数値を和算で自己代入する
		age += 24;
		height += 168.5d;
		weight += 64.2d;
		BMI = (weight/(height*height))*10000;
		
	// コンソールに出力する
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		// BMIは小数第二位までを表示する
		System.out.println("BMIは"+String.format("%.2f",BMI)+"です");
		
		
	// 問題10 年齢が25歳以上ならtrueを出力する(if文は使わない)
	// 値を代入する
		age = 24;
	// 25歳以上ならtrueを出力する
		String str2;
		str2 = age >= 25? "true" : "false";
		System.out.println(str2);
		
		
	// 問題11 問題8の年齢・身長・体重を文字列型に型変換する
		// 代入する
		age = 24;
		height = 168.5d;
		weight = 64.2d;
		
		// 型変換する
		String str3 = String.valueOf(age);
		String str4 = String.valueOf(height);
		String str5 = String.valueOf(weight);
		
		// コンソールに出力する
		System.out.println(str3+str4+str5);
		
		
	// 問題12 問題11の年齢・身長を整数型に変換する
		// 型変換する
		int i1 = Integer.parseInt(str3);
		double i2 = Double.parseDouble(str4);
		
		// コンソールに出力する
		System.out.println(i1);
		System.out.println(i2);
		
		
	// 問題13 問題12の年齢・身長が25歳もしくは160以上であればtrueを出力する(if文を使わない)
	// 宣言する
		boolean result;
	// 条件式を記入する
		result = i1 == 25 || i2 >= 160;
	// コンソールに出力する
		System.out.println(result);
	}

}
