import java.util.Arrays;
import java.util.Scanner;
public class Abc{
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       while(n>0)
       {
           int a=sc.nextInt();
           double i=0;
           while(a>Math.pow(2, i))
           {
               i=i+1;
           }
           double l=Math.pow(2,i);
           int s=(int)l;
           int b1[] = new int[s];
           int p=0;
            for(int j=1;j<16;j++)
            {
                for(int k=1;k<16;k++)
                {
                    if((j^k)==a)
                    {
                        b1[p]=j*k;
                        p=p+1;
                    }
                }
            }
            Arrays.sort(b1);
            System.out.println(b1[s-1]);
           
           n--;
       }
    }
}