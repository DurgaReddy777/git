package CoreJava;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachCharacterInString {
	
	public static void main(String[] args) {
		String s="aeioae";
		char[] c=s.toCharArray();
		Map<Character,Integer> hm=new HashMap();
		for(Character k:c) {
			if(hm.containsKey(k)) {
				hm.put(k, hm.get(k)+1);
			}
			else {
				hm.put(k, 1);
			}
		}
		System.out.println(hm);
	}

}
