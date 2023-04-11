package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list1 = new ArrayList<Integer>();//3,2,11,4,6,7
list1.add(3);
list1.add(2);
list1.add(11);
list1.add(4);
list1.add(6);
list1.add(7);
System.out.println(list1);

List<Integer> list2 = new ArrayList<Integer>();//1,2,8,4,9,7
list2.add(1);
list2.add(2);
list2.add(8);
list2.add(4);
list2.add(9);
list2.add(7);
System.out.println(list2);
for (int i = 0; i < list1.size(); i++) {
	for (int j = 0; j < list2.size(); j++) {
		if(list1.get(i).equals(list2.get(j))){
			System.out.println(list1.get(i));
		}
	}
	
}
	}
	

}
