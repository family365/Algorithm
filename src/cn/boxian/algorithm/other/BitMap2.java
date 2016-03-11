package cn.boxian.algorithm.other;

import java.util.Collections;

public class BitMap2 {

	private Byte[] bitMap;
	private int capability;
	
	public BitMap2(int size) {
		createBitMap(size);
	}
	
	public void createBitMap(int size) {
		capability = size * 2 / 8 + 1;
		bitMap = new Byte[capability];
	}
	
	public boolean setBitMap(int index) {
		int position = index * 2 / 8;
		int offset = index * 2 % 8;
		if (position >= capability) {
			return false;
		}
		
		Byte moreThanTwoTimes = (byte) (bitMap[position] & (1 << (offset + 1)));
		if (moreThanTwoTimes > 0) {
			return true;
		}
		
		Byte result = (byte) (bitMap[position] & (1 << offset));
		if (result == 0) {
			int value = bitMap[position];
			value |= (1 << offset);
			bitMap[position] = Byte.valueOf(String.valueOf(value));
		} else {
			int value = bitMap[position];
			value |= (1 << (offset + 1)); //高位设置为1
			value &= ~(1 << offset);
			bitMap[position] = Byte.valueOf(String.valueOf(value));
		}
		
		return true;
	} 

	public boolean get(int index) {
		int position = index * 2 / 8;
		int offset = index *2 % 8;
		if (position > capability) {
			return false;
		}
		
		if ((bitMap[position] & (1 << offset)) > 0) {
			return true;
		}
		
		if ((bitMap[position] & (1 << (offset + 1))) > 0) {
			return true;
		}
		
		Byte result = (byte) (bitMap[position] & (1 << offset));
		return result > 0 ? true: false;
	}
	
	public boolean isAppearedMult(int index) {
		int position = index * 2 / 8;
		int offset = index *2 % 8;
		if (position > capability) {
			return false;
		}
		
		if ((bitMap[position] & (1 << (offset + 1))) > 0) {
			return true;
		}
		
		//Collections.synchronizedList(list);
		return false;
	}

	public static void main(String[] args) {
		Byte temp = 12;
		System.out.println(temp + 11);
	}

}
