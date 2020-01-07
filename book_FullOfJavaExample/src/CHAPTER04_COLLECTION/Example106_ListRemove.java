package CHAPTER04_COLLECTION;

import java.util.ArrayList;
import java.util.List;

public class Example106_ListRemove {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("X");
		list.add("D");
		list.add("Y");
		list.add("E");
		System.out.println(list);
		
		// 삭제 대상의 요소를 저장
		List<String> list2 = new ArrayList<String>();
		list2.add("X");
		list2.add("Y");
		
		// 삭제하지 않는 대상의 요소를 저장
		List<String> list3 = new ArrayList<>();
		list3.add("A");
		list3.add("E");
		
		// 지정한 인덱스의 요소를 삭제하고, 삭제한 요소를 반환한다.
		System.out.println(list.remove(2));
		System.out.println(list);
		
		// 지정한 요소를 삭제하고, 삭제하는 요소가 없을 경우 false를 반환한다.
		System.out.println(list.remove("D"));
		
		// 지정한 컬렉션의 이의의 모든 요소를 삭제하고, List가 변경되면 true를 반환한다.
		System.out.println(list.retainAll(list3));
		
		// 모든 요소를 삭제
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println();
		
	// * 조건에 일치하는 요소를 삭제한다.
		List<String> listlist = new ArrayList<String>();
		listlist.add("java");
		listlist.add("javascript");
		listlist.add("css");
		
		// 앞부분이 "j"로 시작하는 요소를 삭제
		listlist.removeIf(s -> s.startsWith("j"));
		System.out.println(listlist);
		
		
	}

}
