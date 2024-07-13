#include<stdio.h>
int main(){
     int n;
     printf("Enter a number:");
    scanf("%d",&n);
    // 2(n-1) refers to odd term and i=i+2 is 
    // for the difference as 1,3,5,7 has a differnece of 2 so we used i=i+2
    for(int i=1;i<=2*n-1;i=i+2){
        printf("%d ",i);
    }
    
    // for(int i=4;i<=3*n+1;i=i+3){
    //     printf("%d ",i);
    // }
   return 0;
}