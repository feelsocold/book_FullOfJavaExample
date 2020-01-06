package CHAPTER04_COLLECTION;

// 095. 배열 사용하
public class Example095_Array {
	
	public static void main(String[] args) {

	// 배열은 new연산자로 생성한다. 배열을 new연산자로 생성하면 요소의 형에 대응한 초기값(예를 들어 int라면 0, String 등의 참조형의 경우는 null)으로 초기화한다.
	
	
	// * 배열을 생성한다
	int[] intArray = new int[10];	// 요소의 수가 10인 int형 배열을 생성
	String[] stringArray = new String[5];
	
	// * 요소를 지정하고 배열을 생성한다
	int[] intArray2 = {1, 2, 3, 4, 5};	// 요소를 지정하여 int형 배열을 생성
	String[] stringArray2 = {"A", "B", "C"};
	
	// 생성한 배열은 다음 예제처럼 --변수명 [인덱스]--	 로 요소에 접근할 수 있다.
	
	
	// * 배열의 요소를 구하기, 설정하기
	String[] array = {"A", "B", "C" };
 	System.out.println(array[0]); 		// 배열의 요소 구하기
	array[1] = "E";						// 배열의 요소를 설정하기
	System.out.println(array[1]);
	
	// * 이차원 배열을 생성한다
	int[][] intArray3 = new int[3][2];
	String[][] stringArray3 = new String[2][3];
	
	// 다차원 배열에 대해서도 다음과 같이 배열 생성시 요소를 지정할 수 있다
	
	// * 요소를 지정하고 다차원 배열을 생성한다.
	int[][] intArray4 = {{1, 2}, {3, 4}, {5, 6}};
	String[][] stringArray4 = {{"A", "B", "C"}, {"D", "E", "F"}};
	
	
	}
}
