#include<stdio.h>
int main(){
    // int x= 4 + 2 % -8;//here 2%-8 value will be 2 as in this if number in divisor is greter than dividend then we get the divisor here 
    // float a=2,b=7.0;
    // scanf("%f %f",&a,&b);
    // float x= a/b;
    // printf("%f",x);
    // return 0;

    // Question: Take float as input and print fractional part  of real number
    
    float num, fractional_part;

    // Take a floating-point number as input
    printf("Enter a floating-point number: ");
    scanf("%f", &num);

    // Calculate the fractional part
    fractional_part = num - (int)num;

    // Print the fractional part
    printf("Fractional part: %f\n", fractional_part);
    return 0;
}