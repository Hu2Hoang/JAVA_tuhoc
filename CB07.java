import java.util.Scanner;

public class CB07 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double c=(a)*2*3.14;
        double s=(a*a)*3.14;
        System.out.printf("%.3f %.3f",c,s);
    }
}
