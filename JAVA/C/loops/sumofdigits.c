//wap to print sum of  digits in a given number , write in c
#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d", &n);
    int sum = 0;
    int lastdigit = 0;
    while (n != 0)
    {
        lastdigit = n % 10; //%10 gives the remainder so n%10 is the last digit every time we divide any number with 10 we always get the remainder as last digit
        n = n / 10;         //  /10 gives every no except the last no as we have used integer it doesn't print the values after .
        sum = sum + lastdigit;
    }
    printf("Enter sum of digits:%d ", sum);
    return 0;
}

