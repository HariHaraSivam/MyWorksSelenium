package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range =8, firstNum = 0, secondNum = 1, sum;
System.out.println(firstNum);
System.out.println(secondNum);
for (int i = 1; i <= range-2; i++) {
	sum = firstNum + secondNum;
	firstNum=secondNum;
	secondNum = sum;
	System.out.println(sum);
}
	}

}
