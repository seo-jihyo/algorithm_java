package jungsuk;

class Data{
	int x ;
	}
public class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data(); //데이터 객체 생성, 멤버는 1개
		d.x = 10;
		System.out.println("main() : x = " +d.x);
		
		change(d.x);
		System.out.println("Agter change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
