#include<stdio.h>
int main(){
    int a,b;
    printf("Enter divident: ",a);
    scanf("%d",&a);
    printf("Enter divisor: ",b);
    scanf("%d",&b);
    int q= a/b;
    int r= a-b*q;// divisor= dividend* quotient+ remainder
   printf("The remainder when %d is divided by %d is: %d ",a,b,r);
    return 0;
}