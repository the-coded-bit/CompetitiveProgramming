#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){

    ll t;
    cin >> t;
    while(t--){
        ll n, a, b;
        cin >> n >> a >> b;
        string s;
        cin >> s;

        if(b > 0){
            ll ans = a * n + n * b;
            cout << ans << "\n";
        }
        else{
            ll c = 1;
            for(ll i = 1; i < n; i++){
                if(s[i] != s[i - 1]){
                    c++;
                }
            }
            ll ans = a * n + b * (c/2 + 1);
            cout << ans << "\n";

        }
    }

    return 0;
}