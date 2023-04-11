package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//14,12,13,11,15,14,18,16,17,19,18,17,20
		
		Integer[] k = {1,2};
List<Integer> list = new ArrayList<Integer>(Arrays.asList(k));
list.add(14);
list.add(12);
list.add(13);
list.add(11);
list.add(15);
list.add(14);
list.add(18);
list.add(16);
list.add(17);
list.add(19);
list.add(18);
list.add(17);
list.add(20);
//System.out.println(list.size());
for (int i = 0; i < list.size(); i++) {
	for (int j = 0; j < i; j++) {
		//System.out.println(list.get(j));
		if(list.get(i).equals(list.get(j)))
	    {
		System.out.println(list.get(j));
		}
	}

}

	}

}
