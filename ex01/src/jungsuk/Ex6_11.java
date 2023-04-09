package jungsuk;

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x) {           //매개변수가 있는 생성자
		value = x;
		
	}
//
//	public Data_2() {
//		// 이 기본생성자를 만들어 줘야  메인의 data2를 호출할 수 있다
//	}
}
public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();       //생성자가 하나도 없어서 컴파일러가 자동으로 추가해 주기 때문에 에러가 나지 않음
//		Data_2 d2 = new Data_2();       //기본 생성자 호출-> 기본 생성자를 추가해 줘야 한다.
		//compile error 발생 
	}
}
