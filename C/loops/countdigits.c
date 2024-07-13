#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d", &n);
    int count = 0;//to start count from 0
    while(n!=0)//when we don't know much about conditions use while
    {
        n=n/10;//hint to count any digit we need to use / operator and use 10 as it's value
        count++;
    }
    printf("Enter no.of digits:%d ",count);
    return 0;
}
