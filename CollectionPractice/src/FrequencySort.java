import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencySort {
	

	public static void main(String[] args) {
		String s="Apple Banana Apple Banana Orange Lemon Lemon Lemon";
		String[] strArr=s.split(" ");
		
		Map<String, Integer> smap=new HashMap<>();
		for(int i=0;i<strArr.length;i++) {
			if(smap.containsKey(strArr[i])) {
				smap.put(strArr[i], smap.get(strArr[i])+1);
			}else
				smap.put(strArr[i], 1);
		}
		List<Integer> listValue=new ArrayList<>();
		LinkedList<String> listKey=new LinkedList<>();
		for(String str:smap.keySet()) {
			listValue.add(smap.get(str));
		}
		Collections.sort(listValue);
		
		for(int num:listValue) {
			for(Map.Entry<String, Integer> m:smap.entrySet()) {
				if(m.getValue().equals(num) && !listKey.contains(m.getKey())) {
					listKey.add(m.getKey());
				}
			}
		}
		
		System.out.println(listValue);
		System.out.println(listKey);
		
		System.out.println(smap);
		
//		for(String str:strArr) {
//			System.out.println(str);
//		}

	}

	

}
