import java.util.Arrays;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int x=sc.nextInt();
        int x1[] = new int[x];
        int y=sc.nextInt();
        int y1[] = new int[y];
        int z=sc.nextInt();
        int z1[] = new int[z];
        for(int i=0;i<x;i++) {
            x1[i]=sc.nextInt();
        }
        for(int i=0;i<y;i++) {
            y1[i]=sc.nextInt();
        }
        for(int i=0;i<z;i++) {
            z1[i]=sc.nextInt();
        }
        Arrays.sort(x1);
        Arrays.sort(y1);
        Arrays.sort(z1);
        int sum,d=0;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                for(int k=0;k<z;k++)
                {
                    sum=x1[i]+y1[j]+z1[k];
                    if(sum>d && sum<b)
                    {
                        d=sum;
                    }
                }
            }
        }
        System.out.println(b-d);
    }
    
}
