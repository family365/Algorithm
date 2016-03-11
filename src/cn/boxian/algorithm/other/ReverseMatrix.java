package cn.boxian.algorithm.other;

public class ReverseMatrix {
	//	1	2	3	4
	//	6	7	8	9
	//	10	11	12	13
	//	14	15	16	17
	//expected output: 1,2,3,4,9,13,17,16,15,14,10,6,7,7,12,11
	public static void reverse(int[][] data) {
		int size=5;
		for (int i=0; i < size; i++) {
			// 1, 2, 3, 4
			for (int j =i; j <size; j ++) {
				System.out.println(data[i][j]);
			}
			
			//9
			//13
			//17
			for (int j=i+1; j <size -i; j++) {
				System.out.println(data[j][size-i-1] + " ");
			}
			
			//16, 15, 14
			for (int j= size-i-2; j<=i; j++) {
				System.out.println(data[5-i-1][j] + " ");
			}
			
			//10
			//6
			for (int j=size -i -2;j >i; j--) {
				System.out.println(data[j][i] + " ");
			}
		}
	}
}
