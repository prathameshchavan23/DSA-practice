#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int row, col;
    // for (row = 1; row < n; row++)
    // {
    //     for (col = 1; col < n; col++)
    //     {
    //         if ((row == 1 || col == 1) || (row == n - 1 || col == n - 1))
    //             cout << "*";
    //         else
    //         {
    //             cout << " ";
    //         }
    //     }
    //     cout << endl;
    // }

    // for (row; row <= n; row++)
    // {
    //     for (col = 1; col <= row; col++)
    //     {
    //         cout << "* ";
    //     }
    //     cout << endl;
    // }

    /* A
     BC
     DEF
     GHIJ
     KLMNO */
    // char ch = 'A';
    // for (row; row <= n; row++)
    // {

    //     for (col = 1; col <= row; col++)
    //     {
    //         cout << (char)(ch);
    //         ch = (char)(ch + 1);
    //     }
    //     cout << endl;
    // }

    // for(row=0;row<=5;row++){
    //     for(col=0;col<=5-row;col++){
    //         cout<<"* ";
    //     }
    //     cout<<endl;
    // }

    // char ch = 'A';
    // for(row=1;row<=n;row++){
    //     for(col=0;col<=5-row;col++){
    //         cout<<ch<<" ";
    //     }
    //     cout<<endl;
    //     ch++; //from a to b to c ...
    // }

    /*
    1 2 3 4 5
    2   5
    3  5
    4 5
    5
    */
    //    for(row=0;row<n;row++){
    //     for(col=row+1;col<=n;col++){
    //         if (col == row + 1 || col == n || row == 0)
    //         {
    //             cout<<col<<" ";
    //         } else{
    //             cout<<" ";
    //         }
    //     }
    //     cout<<endl;
    //    }

    return 0;
}