package cn.boxian.algorithm.other;

public class BitCount {
	//求一个二进制数中1的个数
	public static int execute(int num) {
		int count = 0;
		while(num > 0) {
			if ((num & 1) ==1) {
				count ++;
			}
			
			num >>= 1;
		}
		
		return count;
	}
}
