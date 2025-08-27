#include <stdio.h>
int main()
{
   for (int i = 1; i <= 100; i++)
   {
      if (i % 2 == 0)
      { // for odd no
         // if(i%2==1){ // for even no
         continue;
         // continue state refers that loop should be continue as we know i%2=0 so if
         //  loop should not be stop it should continue itself till 100
      }
      printf("%d ", i);
   }
   return 0;
}
