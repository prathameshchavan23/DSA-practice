#include <iostream>
using namespace std;
int main()
{
    int num;
    cin >> num;

    for (int i = 2; i * i <= num; i++)
    {
        if (num % i == 0)
        {
            cout << i << " It is a prime no " << endl;
        }
        else if (num == 1)
        {
            cout << " 1 is neither composite nor prime " << endl;
        }
        else
        {
            cout << i << " it is not a prime no ";
        }
    }
    return 0;
}