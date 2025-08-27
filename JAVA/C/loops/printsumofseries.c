// wap to print sum of all even digits in a given number , write in c
#include <stdio.h>
int main()
{
    int n;
    printf("Enter a numer");
    scanf("%d", &n);
    // 1-2+3-4+5-6+.... n terms
    // above terms can be divided as odd --> add, even --> subtract
    int sum = 0;
        if (n % 2 == 0)
        {
            sum = -n / 2; //-previous/next formula in AP
        }
        else
        {
            sum = -n / 2 + n; // n is for any extra no that can get add
        }

    printf("The sum is: %d", sum);
    return 0;
}
