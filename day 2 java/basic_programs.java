//Write program:

//Take 5 numbers

//Store in array

//Print:

//Sum

//Largest

//Smallest

//Average
import java.util.Scanner;
public class basic_programs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] numbers = new int[5];
        int sum=0;
        
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<5;i++){
            numbers[i]=s.nextInt();

        }
        int l=numbers[0],sa=numbers[0];
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
            sum+=numbers[i];
            if(numbers[i]>l){
                l=numbers[i];
                
            }
            if(numbers[i]<sa){
                sa=numbers[i];
            }
            
        }
            System.out.println("Sum: "+sum);
            System.out.println("Largest: "+l);
            System.out.println("Smallest: "+sa);
            System.out.println("Average: "+((double)sum/5));

            palindrome_check(numbers);
            pyramid();
    }
    // check palindrome and reverse of a number array
    public static void palindrome_check(int numbers[]) {
		System.out.println("enter no. to check palindrome and reverse");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int s=n;
		int rev=0;
		while(n!=0){
			
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
        System.out.println("reverse is "+rev);
		if(s==rev)
		System.out.println(s+" is palindrome");	
		else
		System.out.println(s+" is not palindrome");	
			
		
}
//Average: 3.0
/*
/**
 ***
 ****
 *****/
public static void pyramid() {
    System.out.println("pyramid of *");
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                 }
                System.out.println();
            }

}
}