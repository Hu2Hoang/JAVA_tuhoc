import java.util.Scanner;

public class SUM1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long res=0;
        res=n*(n+1)/2;
        System.out.print(res);
    }
}
