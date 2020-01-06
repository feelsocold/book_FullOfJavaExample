package CHAPTER04_COLLECTION;

import java.util.Comparator;

public class Example099_StringLengthComparator implements Comparator<String>  {

	@Override
	public int compare(String value1, String value2) {
		// 문자열 길이를 비교한다.
		return value1.length() - value2.length();
	}
	
	
}
