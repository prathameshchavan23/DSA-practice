#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number");
    scanf("%d", &n);
    // we're starting our series from 1 1 then addition of both will be 2 2
    int a = 1;
    int b = 1;
    int sum = 0;
    // here in loop, it starts counting from 2 so we have add condition of -2 so it will start from 1 1
    for (int i = 1; i <= n - 2; i++)
    {
        sum = a + b;
        a = b;
        b = sum;
    printf("%d \n",sum);
    }
    return 0;
}