package cn.boxian.algorithm.other;

public class GetSubArrayWithMaxSum {
	public static int execute(int[] data) {
		if (data == null || data.length < 1) {
			return 0;
		}
		
		int currentSum = 0;
		int maxSum = data[0];
		for (int i = 0; i < data.length; i++) {
			currentSum += data[i];
			if (currentSum > maxSum) {
				maxSum = currentSum;
			} else if (currentSum < 0) {
				currentSum =0;
			}
		}
		
		return maxSum;
	}
}
