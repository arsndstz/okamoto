package curriculum_B;

public class Qes_5 {

	public static void main(String[] args) {
		
		
		
		// for文を利用して下記の通りに出力してください。
		for(int i = 1; i < 10; i ++) {
			for(int j = 11; j < 21; j ++) {
				int kuku = i * j;
				
				// 3桁未満の場合0埋めする
				String i3 = String.format("%03d", i);
				String j3 = String.format("%03d", j);
				String result = String.format("%03d", kuku);
							
				if(j < 20) {
					System.out.print(j3 + " * " + i3 + " = " + result + " || ");
				}
				else {
					System.out.println(j3 + " * " + i3 + " = " + result);
				}
			}
		}
		
		
		
	}

}
