package cn.boxian.algorithm.sorter;

public class CardinalSort {
	//基数排序
	//http://blog.csdn.net/morewindows/article/details/8204460,找出重复的数
	public static void findRepeatedNumber(int[] data) {
		if (data == null || data.length < 1) {
			return ;
		}
		
		for(int index = 0; index < data.length; index++) {
			while(data[index] != index) {
				if (data[index] != data[data[index]]) {
					int temp = data[index];
					data[index]= data[data[index]];
					data[data[index]] = temp;
				} else {
					System.out.println(data[index]);
				}
			}
		}
	}
}
