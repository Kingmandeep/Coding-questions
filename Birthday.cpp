#include <bits/stdc++.h> 
using namespace std;
void sum()
{
    if(a<b){
        cout<<a;
    }else{
        while(a>=b)
        {
            a=a-b;
        }

    }
    return a;
}
int main()
{
    int n,a,b;
    cin>>a>>b;
    cout<<sum();
}






#include <bits/stdc++.h>
using namespace std;
void s()
int main()
{
    int n,a,b;
    while(n>0){
        cin>>a>>b;
        if(a>b){
            while(a>b)
            {
                a=a-b;
            }
            cout<<a;
        }else{
            if(a<b){
                cout<<a;
            }else{
                cout<<0;
            }
        }
        n--;
    }
}
