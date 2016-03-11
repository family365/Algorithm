package cn.boxian.algorithm.tree;

/**
 *	在胜者树中，当有节点的值发生改变时，败者树的重构只是与该节点的父节点的记录有关，
 *	而胜者树的重构与该节点的兄弟节点有关
 *	如果索引从 0 开始，左右子节点的索引为
 *	父节点i的左子结点的索引为 2*i + 1
 *	父节点i的右子结点的索引为2*i + 2
 *	子节点i的父节点的索引为 floor((i-1)/2)
 *	
 *	如果索引从1开始，左右子节点的索引为
 *	父节点i的左子结点的索引为 2*i
 *	父节点i的右子结点的索引为2*i + 1
 *	子节点i的父节点的索引为 i/2
 *	
 *	对于胜者树，只有叶子节点中存放了数据，中间节点记录了叶子节点间的关系 
 *	http://blog.csdn.net/sqx2011/article/details/8241734
 */
public class WinnerTree {
	private int kCount; //参加比较的数组中数据的个数
	private int[] winnerTree;
	private int[] realData;
	
	/**
	 * parameter is a index in winner tree array, the value represent the index in real input data
	 * @param parentNodeIndex
	 */
	private void adjustTree(int parentNodeIndex) {
		int leftNodeRealIndex;
		int rightNodeRealIndex;
		
		int leftNodeIndex = 2 * parentNodeIndex;
		int rightNodeIndex = 2 * parentNodeIndex + 1;
		if (leftNodeIndex < kCount) {
			leftNodeRealIndex = winnerTree[leftNodeIndex];
		} else {
			leftNodeRealIndex = leftNodeIndex - kCount;
		}
		
		if (rightNodeIndex < kCount) {
			rightNodeIndex = winnerTree[rightNodeIndex];
		} else {
			rightNodeIndex = rightNodeIndex - kCount;
		}
		
		
	}
}
