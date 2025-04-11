#include <iostream>
using namespace std;
int main()
{
    int num;
    cout << "Enter a no " << endl;
    cin >> num;
    int temp = num;
    int reverse;
    while (num > 0)
    {
        int lastdigit = num % 10;
        reverse = reverse + lastdigit * lastdigit * lastdigit;
        num = num / 10;
    }
    if (reverse == temp)
    {
        cout << "The number is an Armstrong number" << endl;
    }
    else
    {
        cout << "The number is not an Armstrong number" << endl;
    }

    return 0;
}