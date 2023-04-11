package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "changeme";
char[] charArray = test.toCharArray();
System.out.println(charArray);
for (int i = 0; i < charArray.length; i++) {
	//System.out.println(charArray[i]);
	if (charArray[i]%2 == 1) {
		System.out.println(Character.toUpperCase(charArray[i]));
	}
}
	}

}
