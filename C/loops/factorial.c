// wap to print sum of all even digits in a given number , write in c
#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    int factorial = 1; // as it should not start from 0
    for (int i = 1; i <= n; i++)
    {
        factorial = factorial * i;
        printf("The factorial of %d is: %d\n", i,factorial);
    }

    return 0;
}
