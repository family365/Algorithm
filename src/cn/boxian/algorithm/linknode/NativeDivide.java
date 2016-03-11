package cn.boxian.algorithm.linknode;

public class NativeDivide {
	//不用除法，获取两个数相除的结果
	public static int execute(int left, int right) {
		int result = 0;
		int leftValue = left;
		while(leftValue > right) {
			int multi = 1;
			while(right * multi >= leftValue) {
				multi = multi << 1;
			}
			
			result += multi;
			leftValue -= right * multi;
		}
		
		return result;
	}
}
