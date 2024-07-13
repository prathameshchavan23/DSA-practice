#include<stdio.h>
int main(){
    float x=5;
    float y=2;
    float z = 7/3;
    printf("%f\n",x+y);
    printf("%f\n",x-y);
    printf("%f\n",x/y);//it will not print the number after . like if it's 2.5 then it will print 2
  printf("%f",z);// 7 and 3 is integer and the compiler gives the value as integer and if 5.0 /2 you will get decimal not integer

}