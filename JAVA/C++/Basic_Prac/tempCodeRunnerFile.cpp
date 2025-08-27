for (int i = 2; i < num - 2; i++)
    {
        if (num % i == 0)
        {
            cout << i << " It is not a prime no " << endl;
        }
        else if (num == 1)
        {
            cout << " 1 is neither composite nor prime ";
        }
        else
        {
            cout << i << " it is not a prime no ";
        }
    }