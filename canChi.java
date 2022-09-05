//import ;
import java.util.Scanner;

public class canChi{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int nam=sc.nextInt();
		int can=nam%10;
		int chi=nam%12;
		switch(can){
			case 0:
				System.out.print("Canh ");
				break;
			case 1:
				System.out.print("Tan ");
				break;
			case 2:
				System.out.print("Nham ");
				break;
			case 3:
				System.out.print("Quy ");
				break;
			case 4:
				System.out.print("Giap ");
				break;
			case 5:
				System.out.print("At ");
				break;
			case 6:
				System.out.print("Binh ");
				break;
			case 7:
				System.out.print("Dinh ");
				break;
			case 8:
				System.out.print("Mau ");
				break;
			case 9:
				System.out.print("Ky ");
				break;
		}
		switch(chi){
			case 0:
				System.out.print("Than");
				break;
			case 1:
				System.out.print("Dau");
				break;
			case 2:
				System.out.print("Tuat");
				break;
			case 3:
				System.out.print("Hoi");
				break;
			case 4:
				System.out.print("Ti");
				break;
			case 5:
				System.out.print("Suu");
				break;
			case 6:
				System.out.print("Dan");
				break;
			case 7:
				System.out.print("Mao");
				break;
			case 8:
				System.out.print("Thin");
				break;
			case 9:
				System.out.print("Ty");
				break;
			case 10:
				System.out.print("Ngo");
				break;
			case 11:
				System.out.print("Mui");
				break;
		}
	}
}
