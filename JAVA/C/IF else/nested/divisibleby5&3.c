#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if ((n%5==0 || n%3==0) && n%15!=0)
    {
       printf("The no is divisble by 5 0r 3 but not 15");
 }
    else {
        printf("no is divisble by 5 or 3");
    }
    return 0;
}