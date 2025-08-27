#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d", &n);
    int a = 100;
    // condition a>0 make sures that no should be positive as our AP is 100,97 with 3 differnece
    for (int i = 1; a > 0; i++)
    {
        printf("%d \n", a);
        a = a - 3;
    }
    return 0;
}
