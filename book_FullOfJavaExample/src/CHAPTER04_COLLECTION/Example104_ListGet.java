package CHAPTER04_COLLECTION;

import java.util.ArrayList;
import java.util.List;

// 104. List 요소 구하

public class Example104_ListGet {

	public static void main(String[] args) {
		
	// * List 요소를 구한다.
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		
		
		// 인덱스 1의 요소를 구한다.
		System.out.println(list.get(1));
		
		
		// * List의 요소 수를 사전에 확인한다.
		
		// 요소가 1개 이상 있는 것 확인한 후 처리를 실행
		if(list.size() > 0 ) {
			System.out.println("앞 부분 요소 : " + list.get(0));
		}
	}

}
