#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while (t--)
    {
        /* code */
        int row, col;
        cin >> row >> col;
        int a, b;
        int maxi = max(row, col);

        if(maxi % 2){
            a = 1;
            b = maxi;
        }
        else{
            a = maxi;
            b = 1;
        }

        int ans = (maxi * maxi) - (abs(a - row) + abs(b - col));
        cout << ans;
    }
    


    return 0;
}