import java.util.*;


public class Allocation{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        while(n--!=0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a1[]=new int[a];
            for(int i=0;i<a;i++){
                a1[i] = sc.nextInt();
            }
            Arrays.sort(a1);
            int sum=a1[0],i=1,count=0;
            while(sum<=b)
            {
                sum=sum+a1[i];
                i++;
                count++;

            }
            System.out.println("Case #"+p+": "+count);
            p++;
        }
        
    }
}