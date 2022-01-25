#include<bits/stdc++.h>
using namespace std;

#define ll long long
 
int main(){
    ll n, q;
    cin >> n >> q;
    vector<ll> v(n);
    unordered_map<ll, ll> mp;

    
    for(ll i = 0; i < n; i++){
        cin >> v[i];
        if(mp[v[i]] == 0){
            mp[v[i]] = i + 1;
        }
    }

    while(q--){
        ll t;
        cin >> t;
        ll ans = mp[t];
        cout << ans << " ";
        mp.erase(t);
        for(auto it: mp){
            if(it.second < ans){
                mp[it.first] = it.second + 1;
            }
        }
        mp[t] = 1;
    }
    
    return 0;
}