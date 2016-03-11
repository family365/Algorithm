package cn.boxian.algorithm.other;

public class FillArrayWithExistingList {
	//给定一个数组a[N], 我们希望构造数组b[N]，要求O（1）空间复杂度和O（n）的时间复杂度
	//除了遍历计数器与a[N]、b[N]外，不可以使用心得变量（包括栈、临时变量、堆空间和全局静态变量等）
	public int[] fill(int[] srcArray) {
		if (srcArray == null || srcArray.length < 1) {
			return null;
		}
		
		int[] targetArray = new int[srcArray.length];
		targetArray[0] = 1;
		for (int index=1; index < srcArray.length; index++) {
			targetArray[index] = targetArray[index -1] * srcArray[index -1];
		}
		
		for(int index=srcArray.length - 1; index > 0; index--) {
			targetArray[0] *= srcArray[index];
			targetArray[index-1] *= targetArray[0];
		}
		
		return targetArray;
	}
}
