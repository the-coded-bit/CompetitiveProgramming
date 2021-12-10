#include<bits/stdc++.h>
using namespace std;

#define ll long long

bool isPerfectSquare(long long x){
    if(x >= 0){
        long long a = sqrt(x);
        if(a * a == x){
            return true;
        }
    }
    return false;
}

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        
        if(n % 2 != 0){
            cout << "NO\n";
            continue;
        }
        
        ll a = n/2;
        if(isPerfectSquare(a)){
            cout << "YES\n";
            continue;
        }
        
        if(n%4 != 0){
            cout << "NO\n";
            continue;
        }
        
        a = n/4;
        if(isPerfectSquare(a)){
            cout << "YES\n";
            continue;
        }
        cout << "NO\n";
    }
    return 0;
}