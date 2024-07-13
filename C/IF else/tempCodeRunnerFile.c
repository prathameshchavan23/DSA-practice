#include<stdio.h>
int main(){
    int cp;
    printf("Enter cost price");
    scanf("%d",&cp);
    int sp;
    printf("Enter sell price");
    scanf("%d",&sp);
    if(sp>cp){
        printf("proft");
    } 
    if(cp>sp){
        printf("loss");
    }
    else{
        printf("No profit, No loss");
    }
    return 0;
}