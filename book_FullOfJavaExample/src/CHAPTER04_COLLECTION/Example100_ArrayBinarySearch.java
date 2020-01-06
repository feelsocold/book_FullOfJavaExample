package CHAPTER04_COLLECTION;

import java.util.Arrays;

// 100. 배열에 특정요소가 포함되었는지 조사하

public class Example100_ArrayBinarySearch {

	public static void main(String[] args) {
	
	/*
		Array#binarySearch() 메소드를 사용한다. 
		이 메소드로 검색하는 경우 다음사항에 유의해야 한다.
	 		- 사전에 Arrays#sort() 메소드로 배열을 정렬해야 한다.
			- 반환되는 인덱스는 정렬된 시점인 것이다.
			- 배열의 요소에 같은 값이 여러 개 있을 경우 어느 요소가 반환될지는 알 수 없다.
		또한, 목적한 값을 찾지 못한 경우 마이너스 값이 반환된다.
	*/
	
	// * 특정 요소가 포함되는지를 조사
		int[] array = { 30, 10, 20, 15};
		// 우선 배열을 정렬한다.
		Arrays.parallelSort(array);
		// 15가 저장된 인덱스를 구하기
		int result1 = Arrays.binarySearch(array, 15);
		System.out.println("15가 저장된 인덱스 : " + result1);
		// 1이 저장된 인덱스를 구하기  ->  1은 없으니깐 -1이 return.
		int result2 = Arrays.binarySearch(array, 1);
		System.out.println("1이 저장된 인덱스 : " + result2);
		
		
		
	}

}
