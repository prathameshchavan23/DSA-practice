//wap to print sum of all even digits in a given number , write in c
#include <stdio.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    int sum = 0;
    int digit = 0;

    while (n != 0) {
        digit = n % 10; // Get the last digit of n
        if (digit % 2 == 0) { // Check if the digit is even
            sum += digit; // Add the even digit to the sum
        }
        n = n / 10; // Remove the last digit from n
    }

    printf("Sum of all even digits: %d\n", sum);
    return 0;
}
