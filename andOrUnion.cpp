#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main(){

    ll t;
    cin >> t;

    while(t--){
        ll n;
        cin >> n;
        vector<ll> a(n);
        vector<ll> b(32, 0);
        for(ll  i = 0; i < n; i++) cin >> a[i];

        for(ll i = 0; i < 32; i++){
            for(ll j = 0; j < n; j++){
                ll mask = 1 << i;
                ll res = a[j] & mask;
                if(res != 0) b[i]++;
            }
        }
        ll ans = 0;
        for(ll i = 0; i < 32; i++){
            if(b[i] > 1) ans += (int)pow(2, i);
        }

        cout << ans << "\n";
    }

    return 0;
}