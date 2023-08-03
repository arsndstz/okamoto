package curriculum_B;

public class Qes_4 {

	public static void main(String[] args) {
		
		
// for文を利用して下記の通りに出力してください。
		
		
		for(int i = 1; i < 10; i ++) {
			for(int j = 1; j < 10; j ++) {
				int kuku = i * j;
				
				//1桁の場合0埋めする
				String i2 = String.format("%02d", i);
				String i3 = String.format("%02d", j);
				String result = String.format("%02d", kuku);
				
				if(j < 9) {
					System.out.print(i2 + " * " + i3 + " = " + result + " || ");
				}
				else {
					System.out.println(i2 + " * " + i3 + " = " + result);
				}
			}
		}

	}

}
