#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;

        if(n == 1){
            cout << "0\n";
            continue;
        }

        if(n == 2){
            cout << "1\n";
            continue;
        }

        for(ll div = 2; div * div <= n; div++){
            while(n%div == 0){
                n = n/div;
            }
        }

    }
}