import java.util.Scanner;
public class DKD2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int temp =  a>=b?a:b;
		temp=c>=temp?c:temp;
		// if(a>=b) temp=a;
		// else temp=b;
		// if(temp<c) temp=c;
		System.out.println(temp);
	}
}