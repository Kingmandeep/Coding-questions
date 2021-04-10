b,x,y,z = map(int, input().split())
x1 =list( map(int, input().split()))
y1 =list( map(int, input().split()))
z1 =list( map(int, input().split()))
x1.sort()
y1.sort()
z1.sort()
int d=0
for i in range(0,x):
    for j in range(0,y):
        for k in range(0,z):
            sum=x1[i]+y1[j]+z1[k]
                if(sum>d & sum<b):
                     d=sum
                
   
 print(b-d)
    
}