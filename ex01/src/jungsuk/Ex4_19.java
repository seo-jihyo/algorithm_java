package jungsuk;

public class Ex4_19 {
	public static void main(String[] args) {
		
		Loop1 : for(int i=2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j==5) 
					break Loop1;
//					break;   하나만 끝낼 수 있음
//					continue Loop1;
//					continue;
					System.out.println(i+"*"+j+"="+i*j);
				}// end of for i
				
			System.out.println();
			
		}
	}
}
