package cn.boxian.algorithm.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatChar {
	//删除重复的字符，空间复杂度为O(1) 
	public static String execute(String data) {
		if (data == null || data.length() < 1) {
			return data;
		}
		
		Set<Character> singleCharSet = new LinkedHashSet<Character>();
		for(int index =0; index < data.length(); index++) {
			singleCharSet.add(data.charAt(index));
		}
		
		Character[] array =  singleCharSet.toArray(new Character[0]);
		return array.toString();
	}
}
