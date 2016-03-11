package cn.boxian.algorithm.other;

public class GetLeastTimeWhenNumberReduceTo1 {
	//对一个正整数n，算得到1需要的最少操作次数。操作规则为：如果n为偶数，将其除以2
	//如果n为基数，可以加1或减1，一直处理下去
	
	public static int getLeastTime(int seed) {
		if (seed == 1) {
			return 0;
		}
		
		if (seed == 3) {
			return 2;
		}
		
		if (seed %2 == 0) {
			return 1 + getLeastTime(seed / 2);
		}
		
		if ((seed & 3) == 3) {
			seed = seed +1;
			seed = seed / 2;
			return 2 + getLeastTime(seed);
		} else {
			seed = seed - 1;
			seed = seed / 2;
			return 2 + getLeastTime((seed -1) / 2); 
		}
	}
}
