package cn.boxian.algorithm.other;

public class FindTwoNumberWhichSumEquSpecificNumber {
	//Also can use hash to store each number, then get the number sum-Xi as a, to check the number if exist in the hash
	//从一个数组中找出两个数，这两个数的和等于一个指定的数
	
	public static void execute(int[] data, int sum) {
		if (data == null || data.length < 1) {
			return;
		}
		
		int length = data.length;
		int begin = 0;
		int end = length - 1;
		while (end > begin && end <= length - 1 && begin >=0) {
			int currentSum = data[begin] + data[end];
			if (currentSum == sum) {
				int firstNum = data[begin];
				int secondNum = data[end];
				System.out.println("First num: " + firstNum + "; Second num: " + secondNum);
			} else if (currentSum > sum) {
				end --; 	//如果当前两个数之和 > 目标值 end索引递减
			} else {
				begin++;	//如果当前两个数之和 < 目标值 begin索引递增
			}
		}
	}
}
 