import java.util.Scanner;

public class Problem_Day_9 {
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numberr: ");
		Scanner sc = new Scanner(System.in);
		 int i,fact=1;  
		  int number = sc.nextInt();    
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    

	}

}
