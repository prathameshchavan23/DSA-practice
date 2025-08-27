#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if (n % 5 == 0 || n % 3 == 0)
    {
        printf("The no is divisble 5 or 3");
    }
    else
    {
        printf("The no is not divisble 5 or 3");
    }
    return 0;
}