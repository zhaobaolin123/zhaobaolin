#include<stdio.h>
int main()
{
    int a,b;
    while(scanf("%d %d",&a,&b)!=EOF){  //将输入赋值给 a 和 b        
        printf("%d\n",a+b);            //输出 a+b 的结果 
    }
    return 0;
 }
