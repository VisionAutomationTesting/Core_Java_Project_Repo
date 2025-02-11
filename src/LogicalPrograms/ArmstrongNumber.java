package LogicalPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// 123  >> 3 digit number
		// (1*1*1)+(2*2*2)+(3*3*3)=1+8+27=36  
		// 123 != 36

		// 153 
		// (1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153
		
		//12 >> 2 digit number
		// (1*1)+(2*2)=1+4=5
		
		
		// 1234 
		// (1*1*1*1)+(2*2*2*2)+(3*3*3*3)+(4*4*4*4)=1+8+27=36 
		
		// 1634
		
		
		System.out.println("Enter 3 digit number");
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();//123
		int temp=input;
		int sumOfqubes=0;
		
		while(temp>0) {
			int rem=temp%10;
			sumOfqubes = sumOfqubes+(rem*rem*rem);
			temp=temp/10;
		}
		if(input==sumOfqubes) {
			System.out.println(input + " is Armstrong num because sum= "+ sumOfqubes);
		}else {
			System.out.println(input + " is not Armstrong num because sum= "+ sumOfqubes);
		}
//		
		
		// dynamic logic
		
		System.out.println();
		System.out.println("Enter any digit number to verify num is armstrong");
		
		int num=sc.nextInt();
		int abc=num;
		
		int count=0;
		int temp2=num;
		
		while(temp2>0) {
			count++;
			temp2 /=10;
		}
		
		System.out.println("you have entered "+count+" digit number");
		
		
		int totle=0;
		
		while(abc>0) {
			int rem=abc%10; //2
			
			int multi=1;
			
			int i=count;
			while(i>0) {
				multi= multi*rem;
				i--;
			}
			System.out.println(multi);
			totle=totle+multi;
			
			abc=abc/10;
		}
		
		System.out.println();
		if(num==totle) {
			System.out.println(num + " is Armstrong num because sum= "+ totle);
		}else {
			System.out.println(num + " is not Armstrong num because sum= "+ totle);
		}
		
		
	}

}
