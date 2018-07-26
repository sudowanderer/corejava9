package v1ch13.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArraysTest {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[]{1,2,3,4,5};
		//其返回的是一个视图对象 不能调用与迭代器相关的add或remove方法
		List<Integer> list1 = Arrays.asList(intArr);
//		list.add(6);
		
/*		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (integer.equals(5)) {
				//iterator.remove();
			}
		}
		
		List<String> list2 = Collections.nCopies(100, "h");
		list2.add("1");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if ("h".equals(string)) {
				iterator.remove();
			}
		}
		System.out.println(list2);*/
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		list.remove("A");
		list.add("A");
		System.out.println(list);
		
		list.remove("B");
		list.add(1, "B");
		System.out.println(list);
		
		
	}
}
