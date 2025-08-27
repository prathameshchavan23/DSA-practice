#include<stdio.h>
int main(){
    int len;
    printf("Enter length: ");
    scanf("%d",&len);
    int bre;
    printf("Enter breadth: ");
    scanf("%d",&bre);
    int a= len*bre;
    int p=2*(len+bre);
    if(a>p){
        printf("Area is greater than perimeter");
    }else{
        printf("Area is not greater than perimeter");
    }
    return 0;
}