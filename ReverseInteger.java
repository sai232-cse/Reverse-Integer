import java.util.Scanner;
public class ReverseInteger{
	public static void main(String args[]){
		Scanner snr=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=snr.nextInt();
		int rem=0,res=0;
		int num=number;
		while(num>0){
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		System.out.println("The reverse of aa integer is: " + res);
	}
}