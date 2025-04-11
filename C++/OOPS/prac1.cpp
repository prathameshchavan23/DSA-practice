#include <iostream>
using namespace std;
class Student
{
public:
    string name;
    int roll_no;
    float gpa;

public:
    Student()
    { // default constructor
    }
    Student(string n, int r, float g) // parameterised constructor
    {
        name = n;
        roll_no = r;
        gpa = g;
    }
};
int main()
{
    Student s1("Prathamesh", 123, 8.8);
    s1.roll_no = 46; //* It overrides the above constructor valur
    cout << "Name: " << s1.name << endl;
    cout << "Roll No.: " << s1.roll_no << endl;
    cout << "GPA: " << s1.gpa << endl;

    Student s2;
    s2.name = "John Doe";
    s2.roll_no = 456;
    s2.gpa = 9.2;
    cout << "Name: " << s2.name << endl;
    cout << "Roll No.: " << s2.roll_no << endl;
    cout << "GPA: " << s2.gpa << endl;
    return 0;
}