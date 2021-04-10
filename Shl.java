import java.util.Scanner;

public class Shl {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      while(n>0)
      {
          String a=sc.next();
          int count=0;
          if(a.charAt(0)=='1')
          {
              count=count+1;
          }else{
              count=count+0;
          }
          for(int i=1;i<a.length();i++)
          {
              if(a.charAt(i)=='1')
              {
                  if(a.charAt(i-1)=='1')
                  {
                      count=count+0;
                  }else{
                      count=count+1;
                  }
              }
            }
            System.out.println(count);
            n--;
        }

    }
    
}
