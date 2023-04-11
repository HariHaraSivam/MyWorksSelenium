package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> data = new ArrayList<Integer>();//3,2,11,4,6,7
data.add(3);
data.add(2);
data.add(11);
data.add(4);
data.add(6);
data.add(7);
System.out.println(data);
Collections.sort(data);
System.out.println(data);
System.out.println(data.get(data.size()-2));
	}

}
