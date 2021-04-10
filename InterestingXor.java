import java.util.Scanner;

public class InterestingXor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        while(n>0)
        {
            long a=sc.nextLong();
            long b=0,c=1;
            double e=0;
            while(a>=b)
            {
                 e=Math.pow(2, c);
                c++;

            }
            double i=Math.pow(2,c-2)-1;
            double sum=e-a;
            double ans=i*(i+sum);
            System.out.println(ans);

            n--;
        }
    }
}