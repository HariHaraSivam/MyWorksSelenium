package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = new ArrayList<Integer>();//1,2,3,4,7,6,8
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(6);
list.add(7);
list.add(8);
Collections.sort(list);
//System.out.println(list);
for (int i = 1; i < list.size();i++) {
	//System.out.println(list.get(i));
	//System.out.println(i);
	if (list.get(i-1) != i) {
		System.out.println(i);
		break;
	}
	
}
	}

}
