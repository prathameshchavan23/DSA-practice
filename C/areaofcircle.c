#include<stdio.h>
int main(){
    float radius;
    printf("Enter radius:");
    scanf("%f",&radius);  //to take input from user 
    float pi=3.145;
    float area= pi*radius*radius;
    printf("The area of circle is: %f",area);
    return 0;
}