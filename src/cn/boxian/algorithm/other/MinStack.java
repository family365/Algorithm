package cn.boxian.algorithm.other;

//定义栈的数据结构，要求添加一个min函数，能够得到栈的最小元素
//要求函数min、push以及pop的时间复杂度都是O(1)
//可以使用数组形式实现(如果使用的链表，pop的时候必须获取前一个节点，就得使用双向链表)
public class MinStack {
	public static class StackElement {
		private int data;
		private int minValue;
		
		public int getData() {
			return data;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
		public int getMinValue() {
			return minValue;
		}
		
		public void setMinValue(int minValue) {
			this.minValue = minValue;
		}
	}
	
	private int capability;
	private int top;
	private StackElement[] data;
	
	public MinStack(int capability) {
		this.capability = capability;
		this.top = 0;
		data = new StackElement[this.capability];
	}
	
	public boolean push(int value) {
		if (top > this.capability) {
			return false;
		}
		StackElement newElement = new StackElement();
		newElement.data = value;
		newElement.minValue = top == 0 ? value : data[top -1].minValue;
		if (value < newElement.minValue) {
			newElement.minValue = value;
		}
		
		data[top] = newElement;
		top ++;
		
		return true;
	}
	
	public int pop() {
		if (top == 0) {
			throw new RuntimeException("Not found data");
		}
		
		return data[--top].data;
	}
	
	public int getMin() {
		if (top == 0) {
			throw new RuntimeException("Not found data");
		}
		
		return data[top -1].minValue;
	}
}
