package CHAPTER04_COLLECTION;

import java.awt.Point;
import java.util.Arrays;

// 098. 배열을 복사하기

// Java6에서 추가된 Arrays#copyOf() 메소드나 Array$copyRangeOf() 메소드를 사용한다.
// 이러한 메소드는 내부적으로 System#Arraycopy() 메소드를 호출한다.

public class Example098_ArrayCopy {
	
	public static void main(String[] args) {
	
	// * 배열을 복사한다.
		// 원본 배열 
		int[] array = {30, 10, 20, 15};
		
		// 같은 배열의 길이로 복사하는 경우
		int[] sameArray = Arrays.copyOf(array, array.length); 
		
		// 같은 배열의 길이로 복사하는 경우, 지정한 배열 길이까지의 범위로 보가하여 반환 
		int[] shortArray = Arrays.copyOf(array, 2);
		
		// 긴 배열의 길이로 복사하는 경우, 남은 부분에 데이터형에 맞는 값으로 반환
		int[] longArray = Arrays.copyOf(array, 6);
		
		// 복사 원본 배열 길이의 범위 내의 인덱스를 지정한 경우,
		// from-to 길이의 배열 길이를 복사하여 반환
		int[] rangeArray = Arrays.copyOfRange(array, 1, 3);
		
		// 복사 원본 배열 길이보다 긴 범위의 인덱스를 지정하여 복사하는 경우,
		// 데이텨형에 맞는 값을 채워 반환
		int[] longRangeArray = Arrays.copyOfRange(array, 2, 5);
	
		
		/*
			Array#copyOf() 메소드나 System#arraycopy() 메소드는 '얕은 복사'가 되는 점에 주의해야한다.
			 '얕은 복사(Shallow Copy)'는 복사 장소가 유지하는 참조를 복사하고 새로운 객체를 생성하는 것을 뜻한다.
			이에 대해서 '깊은 복사(Deep Copy)'는 복사 장소가 유지하는 참고형 변수 내용을 포함하여 전부 복사하는 것을 뜻한다.
			 얕은 복사로 충분한지, 깊은 복사가 필요한지는 매번 검토해야 한다. 
			 그리고 깊은 복사가 필요한 경우에는 참조 장소의 객체를 복사해야한다. 
		*/
		
		
	// * copyOf() 메소드가 '얕은 복사'임을 확인하는 예
		// srcPoint와 destPoint에 복사
		Point[] srcPoint = { new Point(10, 20), new Point(30, 40)};
		Point[] destPoint = Arrays.copyOf(srcPoint, 2);
		
		// 복사 원본의 배 내 객체의 속성을 변경하면, 복사한 곳의 객체의 속성 값도 변경된다.
		
		srcPoint[0].x = 50;
		
		System.out.println(srcPoint[0].x);
		System.out.println(destPoint[0].x);
		
		
		
	// * 참조하는 곳의 객체를 복사하는 '깊은 복사'의 예
		// 원본 배열
		Point[] srcPoint2 = {new Point(10, 20), new Point(30, 40)};
		int size = srcPoint.length;
		
		// 복사할 곳의 배열
		Point[] destPoint2 = new Point[size];
		
		// srcPoint에서 destPoint로 깊은 복사를 한다.
		for (int i = 0; i < destPoint2.length; i++) {
			//속성을 토대로 새로운 instance를 작성한다.
			destPoint2[i] = new Point(srcPoint2[i].x, srcPoint2[i].y);
		}
		
		// 복사 원본의 배열 내의 객체의 속성값을 변경해도
		// 복사한 곳의 객체의 속성 값은 변하지 않는다.
		srcPoint2[0].x = 50;
		
		System.out.println(srcPoint2[0].x);
		System.out.println(destPoint2[0].x);
		
		
	}
}
