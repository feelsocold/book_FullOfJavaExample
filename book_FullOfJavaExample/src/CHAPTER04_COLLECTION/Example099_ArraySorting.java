package CHAPTER04_COLLECTION;

import java.util.Arrays;
import java.util.Comparator;

// 099. 배열을 정렬하기

public class Example099_ArraySorting {

	public static void main(String[] args) {
	// Arrays#sort() 메소드를 사용한다.
		
	// * 배열을 정렬한다.
		// 배열 Array를 오름차순으로 정렬한다.
		String[] array = {"apple", "strawberry", "blueberry", "oragne" };
		Arrays.sort(array);
		System.out.println(Arrays.deepToString(array));
		
	// * 배열 arrayRange를 인덱스 1에서 3미만의 범위로 오름차순으로 정렬한다.
		int[] arrayRange = { 1, 5, 2, 4, 3 };
		Arrays.parallelSort(arrayRange, 1, 3);
		System.out.println(Arrays.toString(arrayRange));
	
		
	// 또한, Array#sort() 메소드의 인수에 java.util.Comparator객체를 전달함으로써 정렬 방법을 커스터마잊 할 수도 있다.
	// Comparator 인터페이스에서는 compare() 메소드가 정의되었으며, 인수 2개의 비교 결과를 다음 반환값으로 구현한다.
		
	// 인수1 > 인수2 : 양수를 반환
	// 인수1 < 인수2 : 음수를 반환
	// 인수1 = 인수2 : 0을 반환
		
	
	// 문자열 길이를 비교하는 자체 Compartor를 이용하여 배열을 정렬한다.
	
	// * 문자열 길이로 배열을 정렬한다.
		
		
		// 문자열 길이로 비교한다. Compartor 인터페이스의 구현
		Arrays.sort(array, new Example099_StringLengthComparator());
		System.out.println(Arrays.deepToString(array));
		
		
	}

	
}
