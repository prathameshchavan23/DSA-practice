#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter no: " << endl;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        // Print leading spaces
        for (int j = 1; j < i; j++)
        {
            cout << " ";
        }

        // Print stars with spaces in between
        for (int j = 0; j < (2 * (n - i) + 1); j++)
        {
            cout << "*";
        }

        cout << endl; // Move to the next row
    }
    return 0;
}
