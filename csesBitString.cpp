#include <bits/stdc++.h>
using namespace std;

long long power(long long x, long long y, long long M){

    if(y == 0)
        return 1;

    long pyb2 = power(x, y/2, M) % M;
    long py = pyb2 % M * pyb2 % M;
    if (y % 2 == 1)
    {
        /* code */
        py = py % M * x % M;
    }
    return py % M;
    
}

int main(){
    long  long y;
    cin >> y;
    long long M = 1e9 + 7;
    cout << power(2,y, M);

    return 0;
}