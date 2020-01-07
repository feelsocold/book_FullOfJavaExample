package CHAPTER04_COLLECTION;

import java.util.ArrayList;
import java.util.List;

// 103. List에 요소를 추가하기

// List#add() 메소드를 사용한다.
// List의 끝 또는 지정한 인덱스의 위치에 요소를 추가할 수 있다.

public class Example103_ListAdd {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// [A, B, C]의 인덱스 2번째에 요소를 삽
		list.add(2, "Z");
		System.out.println(list);
		
		// List의 맨 앞에 요소를 추가
		list.add(0, "X");
		System.out.println(list);
		
		// 또한, List에 다른 컬렉션의 요소를 한꺼번에 추가할 경우는 add() 메소드 대신 addAll()메소드를 사용할 수 있다.
	}

}
