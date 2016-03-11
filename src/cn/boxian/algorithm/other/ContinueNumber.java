package cn.boxian.algorithm.other;

public class ContinueNumber {
	//在字符串中找出连续最长的数字串，并把这个串的长度返回
	//例如 abcd12345ed125ss123456789, 打印123456789
	public int execute(String src) {
		if (src == null || src.trim().length() == 0) {
			return -1;
		}
		
		int startIndex = 0;
		int maxLength = 0;
		int currentLength = 0;
		for (int index = 0; index < src.length(); index++) {
			char currentChar = src.charAt(index);
			if (Character.isDigit(currentChar)) {
				currentLength += 1;
			} else {
				if (currentLength > maxLength) {
					maxLength = currentLength;
					startIndex = index - currentLength;
				}
				
				currentLength = 0;
			}
		}
		
		String digitStr = src.substring(startIndex, startIndex + maxLength);
		System.out.println(String.format("got max digit string: %s", digitStr));
		return maxLength;
		
	}
}
