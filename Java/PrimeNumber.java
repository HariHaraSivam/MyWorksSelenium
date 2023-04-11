package week1.day2;

public class PrimeNumber {
public static void main(String[] args) {
	int num = 13;
	Boolean flag = false;
	for (int i = 2; i<num; i++) {
		if(num%i == 0) {
			flag = true;
			break;
		}
	}
	if (!flag) 
		System.out.println("it's a prime number");
	
	else 
	
		System.out.println("not a prime number");
	
	
}
}
