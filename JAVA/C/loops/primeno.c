#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d", &n);
    int a = 0;
    for (int i = 2; i <= n - 1; i++)
    {
        if (n % i == 0) 
        {
            a = 1;
            break;
        }
    }
    if (a == 0)
        printf("Given no is a prime\n");
    else
        printf("Given no is a composite\n");
    return 0;
}

