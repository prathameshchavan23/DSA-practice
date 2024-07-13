#include<stdio.h>
int main(){
   int n;
   printf("Enter a number");
   scanf("%d",&n);
    if(n%5==0 || n%3==0){ // && satisfies that both the conditions should be true
        printf("It is divisble by 5 or 3");
    }else{
        printf(" It is not divisble by 5 or 3");
    }
    return 0;
}