// Quest: Taje a positive integer input and tell if it is divisble by 5 or not
#include<stdio.h>
int main(){
    int n;
    printf("Enter a number");
    scanf("%d",&n);
if (n%5==0)//comprator operator (==)
{
    printf("divisble by 5");
} 
else{
    printf("Not divisble");
}
    return 0;
}