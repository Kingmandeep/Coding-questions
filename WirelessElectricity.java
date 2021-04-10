import java.util.Scanner;

public class WirelessElectricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x[]= new int[n];
        int y[]= new int[n];
        int a[]= new int[m];
        int b[]= new int[m];
        int c[]= new int[m];
        int d[]= new int[m];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
            d[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            if(a[i]>c[i])
            {
                int t=a[i];
                a[i]=c[i];
                c[i]=t;
            }
            if(i%2==0){
                System.out.println(-a[i]+" "+-b[i]);
            }
        }
    }
    
}
