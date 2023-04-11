package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 34343, temp = 0;
int number = num;
for (int i = 0; i <5; i++) {
	temp = temp*10 + num%10;
	num = num/10;
}
if (temp == number) {
	System.out.println("Number is palindrome");
}
	}

}
