package jungsuk;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		//set의 크기가 G보다 작은 동안 1 ~45 사이의 난수를 저장
		for (int i = 0; i < set.size(); i++) {
			int num = (int)(Math.random()*45) + 1;
//			set.add(new Integer(num));
			set.add(num);
		}
		System.out.println(set);
//		List list = new LinkendList(set);   //LinkedList(Collection c)
//		Collections.sort(list);;			//Collections.sort(List list)
//		System.out.println(list);
//	Set은 정렬 불가. -> set의 모든 요소를 list에 저장한 후 list를 정렬한다.
	}
}
