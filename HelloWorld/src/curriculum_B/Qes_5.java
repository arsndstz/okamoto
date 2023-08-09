package curriculum_B;

public class Qes_5 {

	public static void main(String[] args) {
		
		
		
		// for文を利用して下記の通りに出力してください。
		for(int i = 1; i < 10; i ++) {
			// 1桁の場合0埋めする
			String i2 = String.format("%02d", i);
			
			System.out.print(i2 + " = " + i2 + i + " || ");

			for(int j = 12; j < 21; j ++) {
				int kuku = i * j;
				
				// 3桁未満の場合0埋めする
				String i3 = String.format("%03d", i);
				String j2 = String.format("%03d", j);
				String result = String.format("%03d", kuku);
							
				if(j < 20) {
					System.out.print(i3 + " * " + j2 + " = " + result + " || ");
				}
				else {
					System.out.println(i3 + " * " + j2 + " = " + result);
				}
			}
		}
		
		
		
	}

}
