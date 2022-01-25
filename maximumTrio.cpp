#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        vector<ll> v(n);
        for(ll i = 0; i < n; i++) cin >> v[i];

        sort(v.begin(), v.end());
        ll ans = (v[n - 1] - v[0])*v[n - 2];
        cout << ans << "\n";
    }
    return 0;
}