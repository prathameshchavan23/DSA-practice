#include <stdio.h>
int main()
{
  int n, i;

  // Prompt the user to enter an integer
  printf("Enter an integer: ");
  scanf("%d", &n);

  // Print the table of the integer n
  printf("Table of %d:\n", n);
  for (i = 1; i <= 10; ++i)
  {
    printf("%d x %d = %d\n", n, i, n * i);
  }

  return 0;
}