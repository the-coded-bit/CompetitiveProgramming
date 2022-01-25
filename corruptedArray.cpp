// corrupted array codeforces question
#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;

        vector<ll> b(n+2);
        for(ll i = 0; i < n + 2; i++) cin >> b[i];

        sort(b.begin(), b.end());

        ll sum = 0;
        ll x = -1;
        for(ll i= 0; i < n + 1; i++) sum += b[i];

        for(ll i = 0; i < n + 1; i++){
            if(sum - b[i] == b[n + 1]){
                x = b[i];
                break;
            }
        }

        if(x != -1){
            for(ll i = 0; i < n + 1; i++){
                if(b[i] == x){
                    x = -1;
                    continue;
                }
                cout << b[i] << " ";
            }
            cout << endl;
        }
        else{
            ll s = sum - b[n], y = -1;
            if(s == b[n]){
                for(ll i = 0; i < n; i++) cout << b[i] << " ";
                cout << endl;
            }
            else{
                cout << "-1\n";
            }
        }
    }
    return 0;
}