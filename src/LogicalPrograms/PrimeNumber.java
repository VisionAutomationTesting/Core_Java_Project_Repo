package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// only divisible by 1 or itself i.e. prime number
		
		
		//4 == 1--4 == 2
		//25 == 1 -- 25 == 5
		// 26 == 1 -- 26 == 2, 13
		
		// 44 == 1 -- 44 == 2, 4, 11, 22 
		
		// 52 == 1--52 == 26 -- 
		// 2 -- 9 
		// 1251 == 5 - 2 -- 3 
		
		//13 === 2---6 == 13 prime
		// 2 -- till half of the num
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();//123
		
		int mid=input/2;
		System.out.println("mid point is ="+ mid);
		
		boolean flag=true;
		
		int count=2;
		
		while(count<=mid) {
			if(input%count==0) {
				flag=false;
				break;
			}
			
			count++;
		}
		
//		for(int i=2; i<=mid; i++) {
//			
//			if(input%i==0) {
//				flag=false;
//				break;
//			}
//		}
		
		if(flag) {
			System.out.println(input +" is prime number");
		}else {
			System.out.println(input +" is not prime number because it divisibale by "+ count);
		}
		
		
		

	}

}
