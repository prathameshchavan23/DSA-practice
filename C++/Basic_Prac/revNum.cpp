#include <iostream>
using namespace std;
int main()
{
    int num, reverseNum = 0;
    cout << "Enter a number";
    cin >> num;
    int dup = num;
    if (num == 0)
    {
        cout << "Number is 0";
    }
    else
    {
        while (num > 0)
        {
            int lastdigit = num % 10;
            reverseNum = (reverseNum * 10) + lastdigit;
            num = num / 10;
        }
    }
    if (dup == reverseNum)
        cout << "true it is palindrome"<<endl;
    else
        cout << "false it is not palindrome "<<endl;

    cout << "Reverse of the number is " << reverseNum;

    return 0;
}