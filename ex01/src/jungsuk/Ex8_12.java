package jungsuk;

public class Ex8_12 {
	public static void main(String[] args) {
		
		try {               // 호출한 곳에서 try-catch 다시 처리 ( 두번 )
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
			
		}
	}// end of main
	static void method1() throws Exception {
		try {
			throw new Exception();  //1.예외 발생 - trycatch로 처리
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었스빈다.");
			throw e;				//2. 예외를 다시 발생 -> 호출한 곳으로 다시 감.
		}
	}// end of method1
}
