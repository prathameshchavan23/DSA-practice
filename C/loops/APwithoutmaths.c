#include<stdio.h>
int main(){
     int n;
     printf("Enter a number:");
    scanf("%d",&n);
     int a=4;
    for(int i=1;i<=n;i++){
        printf("%d ",a);
        a=a+3; // condition is for AP=3*(n+1)
        //focus on it's difference let's say they have diff of +3 then add a=a+3
    }
   return 0;
}

