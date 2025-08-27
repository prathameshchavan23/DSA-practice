#include <stdio.h>
int main()
{
    //  int x=4,y=3,z;
    //  z=x-- -y;
    //  printf("\n %d %d %d",x,y,z);//x++ means use x then increment
    // x++ means increment then use
    int x = 4;
    printf("\n%d ", ++x);
    printf("\n%d ", --x);
    printf("\n%d ", x++);
    printf("\n%d ", x--);

    return 0;
}
