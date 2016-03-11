package cn.boxian.algorithm.other;

import sun.security.util.Length;

public class FindNumberInArray {
	//有这样一个数组A，大小为n，相邻元素差的绝对值都是1
	//如：A={4,5,6,5,6,7,8,9,10,9}，现在给定A和目标整数t，请找到t在A中的位置
	//除了依次便利，还有更好的方法吗
	//http://blog.csdn.net/morewindows/article/details/10645269
	public static int findNumber(int[] data, int target) {
		int position = Math.abs(target - data[0]);
		while(position < data.length) {
			if (data[position] == target) {
				return position;
			} else {
				position += Math.abs(target - data[position]); 
			}
		}
		
		return -1;
	}
	
	//在一个数组中除两个数字只出现1次外，其他数字都出现2次，要求尽快找出这两个数字
	//http://blog.csdn.nent/morewindows/article/details/8214003
	//0 与 任何数亦或将不改变原来的数值
	public static void findNotRepeatNumber(int[] data) {
		int temp = 0;
		int firstNum = 0;
		int secondNum = 0;
		for (int index=0; index< data.length; index++) {
			
		}
	}
}
