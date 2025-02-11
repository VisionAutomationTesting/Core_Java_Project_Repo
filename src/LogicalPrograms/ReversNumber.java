package LogicalPrograms;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number whch u want to reveres!");
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
//		System.out.println("rem "+ (input%100));
//		System.out.println("rem "+ (input/10));
		
		System.out.println("you have entered ="+ input); //1234 -- 4321
		int output=0;
//				0>0
		while(input>0) {
					//1
			int rem=input%10; // 4 3 2 1
//					432*10+1=  4321
			output=output*10+rem; // 4321
			
			input =input/10; // 0
			
		}
		
		System.out.println("revers num ="+output);
		
		
		// addition of all number
		
		System.out.println("enter number to get totle");
		
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum of all given number  ="+sum);
		
		System.out.println("enter number to get length");
		
		int abc=sc.nextInt();
		int count=0;
		int temp=abc;
		
		while(temp>0) {
			count++;
			temp /=10;
		}
		
		System.out.println("count of "+abc+" is ="+ count);
		
		//1 calculate the sum - value of even position number
		// 123456
		// 5+3+1
		
		//2 calculate the sum - value of all even & odd number
		// 3968512
		// 2+8+6
		
		// find the sum of numbers in between
		// 123 > 2
		// 1234 > 2+3= 5
		//12345 > 2+3+4= 9

		
		sc.close();
		
	}

}
