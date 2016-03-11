package cn.boxian.algorithm.other;

public class BitMap  {
	private Byte[] bitMap;
	private int capability;
	
	public BitMap(int size) {
		createBitMap(size);
	}
	
	public void createBitMap(int size) {
		capability = size / 8 + 1;
		bitMap = new Byte[capability];
	}
	
	public boolean setBitMap(int index) {
		int position = index / 8;
		int offset = index % 8;
		if (position >= capability) {
			return false;
		}
		
		int value = bitMap[position];
		value |= (1 << offset);
		bitMap[position] = Byte.valueOf(String.valueOf(value));
		return true;
	} 
	
	public boolean get(int index) {
		int position = index / 8;
		int offset = index % 8;
		if (position > capability) {
			return false;
		}
		
		Byte result = (byte) (bitMap[position] & (1 << offset));
		return result > 0 ? true: false;
	}

	public static void main(String[] args) {
		char temp = 'a';
		System.out.println(Byte.SIZE);
	}
}
