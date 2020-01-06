package CHAPTER04_COLLECTION;

import java.util.Arrays;

// 101. 배열 비교하기

// Arrays#deepEquals() 메소드를 사용한다.
// 이 메소드에서는 2개의 배열의 요소가 똑같은지 비교할 수 있따.
public class Example101_ArrayDeepEquals {

	public static void main(String[] args) {
	// * 배열을 비교하기
		int[][] intArray1 = {{1,2,3}, {4,5,6}};
		int[][] intArray2 = {{1,2,3}, {4,5,6}};
		
		System.out.println(Arrays.deepEquals(intArray1, intArray2));
	
	/* 
	  	* deepEquals()와 equals()의 차이점
		
		Arrays#equals() 메소드에서도 배열 비교를 할 수 있다.
		그러나 Arrays#equals() 메소드는 요소와 내용이 아닌 참조처가 같은지 비교하기 때문에
		다음의 경우에는 다른 배열이라고 판정한다.
	 */
		
		// * 배열을 비교하기
		System.out.println(Arrays.equals(intArray1, intArray2));
			// equals는 배열의 메모리 주소가 서로 같은지를 판정한다.
	
	
	
	}
}
