package CoreJava;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachWordInString {
	
	public static void main(String[] args) {
		String s="ae io ae ae fg";
		String[] s1=s.split(" ");
		Map<String,Integer> hm=new HashMap();
		for(String k:s1) {
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
