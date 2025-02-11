package LogicalPrograms;

import java.util.Scanner;

public class FindThePairWhichSumIs8 {

	public static void main(String[] args) {
		// find the pair which have sum = 8
		// 46325 > 5+3 = 8 > (5,3) | 6+2=8 >(2,6)
		// 4 >> 8-4== 4 >>
		// 5 >> 8-5= 3 -- 3 (5,3)

		// 123987654
		System.out.println("Enter the number to fing the pairs which have sum as 8 ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("Number is =" + num);

		
		
		// only for digit count
//		int temp = num;
//		int digitCount = 0;
//		while (temp > 0) {
//			temp /= 10;s
//			digitCount++;
//		}
//		System.out.println("totle number of digit in enterd number = " + digitCount);

		// 123987654
		
		//int[] allPairsStart=new int[digitCount-1];

		while (num > 0) {
			int firstNum = num % 10; // first number in pair 5
			int secondNum = 8 - firstNum; // 3
//			System.out.println("first num =" + firstNum + " second expected num =" + secondNum);
			int temp2 = num / 10;
//			System.out.println("temp2 =" + temp2);
			int rem = temp2 % 10;
			boolean flag=false;
			
			while (secondNum != rem && temp2 > 0) {
//				System.out.println("--rem =" + rem);
				rem = temp2 % 10; // 2
				temp2 /= 10; // 163
//				System.out.println("--temp2 =" + temp2);
				
//				if(secondNum == rem) {
//					flag= true;
//					break;
//				}
			}
			if(secondNum == rem) {
				flag= true;
			}

			if ((firstNum + secondNum) == 8 && flag) {
				boolean result=true;

//					for(int ele :allPairsStart) {
//						if(ele==firstNum || ele== secondNum) {
//							result=false;
//						}
//					}
//					if(flag)
				System.out.println("Pair = " + firstNum + "," + secondNum);
			}

			num = num / 10;
//			System.out.println("num =" + num);
//			System.out.println();
		}
		

		System.out.println("END");
		sc.close();
	}

}
