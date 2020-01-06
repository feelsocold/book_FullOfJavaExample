package CHAPTER04_COLLECTION;

// 097. 배열이 요소를 반복 처리하기

// for문을 사용한다. 인덱스를 지정하여 각 요소를 구하는 방법과 확장 for문을 이용하는 방법의 2종류 사용 방법이 있다.
public class Example097_ArrayFor {

	public static void main(String[] args) {
		
	// * 배열의 요소를 반본 처리 한다.
		int[] array = {1, 2, 3};
		
		// 방법 1 : 인덱스를 이용한 경우
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// 방법 2 : foreach문(확장 for문)을 이용한 경우
		for (int value : array) {
			System.out.println(value);
		}
		
		System.out.println();
		
	// * 다차원 배열의 요소를 반복 처리한다.
		int[][] array2 = {{1,2,3}, {4,5,6}};
		
		// 방법 1 : 인덱스를 이용한 경우
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]);
			}
		}
		
		// 방법 2 : 확장 for문을 이용한 경우
		System.out.println();
		for (int[] inArray : array2) {
			for (int value2 : inArray) {
				System.out.print(value2);
			}
		}
		
		
		
		
	}

}
