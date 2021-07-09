#include <bits/stdc++.h>
using namespace std;

//this is euclid algorithm to find gcd basically calculating gcd using long division method
//time complexity is o(log n)
int gcd(int a, int b){
    //base condition
    if(a == 0)
        return b;
    int res = gcd(b%a, a);
    return res;
}


int main(){

    int a,b;
    cin >> a >> b;
    cout << gcd(a,b);
    return 0;
}