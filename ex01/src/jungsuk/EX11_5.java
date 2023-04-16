package jungsuk;

import java.util.ArrayList;
import java.util.Iterator;

public class EX11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
				Object obj = it.next();
				System.out.println(obj);
		}
		
		/*iterator는 1회용이라 한번 쓰고 나면 다시 얻어와야 함
		it = list.iterator();  // 새로운 iterator 객체 얻어옴
		
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		*/
		for (int i = 0; i < list.size(); i++) {
			Object obj = it.next();
			System.out.println(obj);
			
		}
		
	}
}
