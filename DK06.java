import java.util.Scanner;
import java.text.DecimalFormat;
public class DK06 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       	int a=sc.nextInt();
        int b=sc.nextInt();
      //  DecimalFormat decimalFormat = new DecimalFormat("#.##");   
        if(a==0){
            if(b==0) System.out.print("INF");
            else System.out.print("NO");
        }
        else{
            double res=0.00;
            res=(double)-b/a;
            System.out.printf("%.2f",res);
        }

    }
}
