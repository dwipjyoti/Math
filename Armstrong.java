import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=obj.nextInt();
		int length=0;
		int t1=num;
		while(t1 != 0) {
			t1 = t1/10;
			length=length+1;
		}
		
		
		int t2=num;
		int rem;
		double arm=0;
//		while(t2 != 0) {// THE LOOP WILL RUN UNTIL NUMBER BECOMES ZERO
//			rem=t2 % 10;
//			int mul=1;
//			for(int i=1;i<=length;i++) {//OUT OF FOR LOOP WHEN i>=LENGTH
//				mul=mul*rem;	//TO MULTIPY THE NUMBER WITH REMAINDER AND STORE IT 
//			}
//			arm=arm+mul;
//			
//			t2=t2/10;	//TO OUT OF WHILE "WHILE-LOOP" WE MUST MAKE T2=0
//		}
		
		
		while(t2 != 0) {
			rem=t2%10;
			arm=arm+ Math.pow(rem,length);
			t2=t2/10;	
		}
		if(arm==num)	//CHECK NUMBER IS EQUAL TO ITS SAME NUMBER OR NOT
			System.out.println(num+" number is armstrong number");
		else
			System.out.println(num+" number is not armstrong number");
	}

}
