package CHAPTER04_COLLECTION;

import java.lang.reflect.Array;

// 096. 배열의 길이 구하기

// 배열의 length속성을 사용한다. length 속성으로 배열의 요소 수를 구한다.
public class Example096_ArrayLength {

	public static void main(String[] args) {
		String[] stringArray = { "A", "B", "C" };
		System.out.println(stringArray.length);
		
		// 배열에 대한 인덱스를 지정하여 오소 구하기, 설정을 할 떄 요소의 범위를 초과하는 인덱스를 지정하면
		// ArrayIndexOutOfBoundsException이 발생된다. 요소 수를 모르는 배열에 대해서 조작을 하는 경우에는 
		// 미리 length속성으로 배열 크길ㄹ 확인하도록 한다.
		
		// * 배열의 요소 소를 확인하고 처리한다.
		
		if(stringArray.length > 0) {
			System.out.println("맨 앞의 요소 : " + stringArray[0]);
			
		}
		
	}

}
