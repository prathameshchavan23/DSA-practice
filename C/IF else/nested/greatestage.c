#include <stdio.h>
int main()
{
    int Ram ;
    int shyam;
    int Ajay;
    printf("Enter Ram age: ");
    scanf("%d", &Ram);
    printf("Enter Shyam age: ");
    scanf("%d", &shyam);
    printf("Enter Ajay age: ");
    scanf("%d", &Ajay);
    if (Ram > shyam && Ram > Ajay)
    {
       printf("%d Ram age is greater from else",Ram);
    }
    if (shyam > Ram && shyam > Ajay)
    {
       printf("%d shyam age is greater from else",shyam);
    }
    if (Ajay > Ram && Ajay > Ram)
    {
       printf("%d Ajay age is greater from else",Ajay);
    }
    else{
        printf("All are equal");
    }
    return 0;
}