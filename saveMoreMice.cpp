// codeforce save more mice problem 159 3c

#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n, k;
        cin >> n >> k;
        vector<ll> v(k);
        
        for(ll i = 0; i < k; i++) cin >> v[i];

        sort(v.begin(), v.end());
        
        ll catpos = 0, i = v.size() - 1, ans = 0;
        while(catpos < n && i >= 0){
            ll diff = n - v[i];
            catpos += diff;
            if(catpos < n){
                ans++;
            }
            i--;
        }

        cout << ans << "\n";
    }
    return 0;
}