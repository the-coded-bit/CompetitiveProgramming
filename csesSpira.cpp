#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        /* code */
        long long row, col;
        cin >> row >> col;
        long long a, b;
        long long maxi = max(row, col);

        if (maxi % 2)
        {
            a = 1;
            b = maxi;
        }
        else
        {
            a = maxi;
            b = 1;
        }

        long ans = (maxi * maxi) - (abs(a - row) + abs(b - col));
        cout << ans << endl;
    }

    return 0;
}