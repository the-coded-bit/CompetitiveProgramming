#include<bits/stdc++.h>
using namespace std;

#define ll long long

bool sortbysec(const pair<int, int> &a, const pair<int, int> &b){
    return a.second > b.second;
}

int main(){

    ll t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        if(n == 1){
            cout << 0 << endl;
            cout << 1 << " "<< 2 << endl;
            continue;
        } 
        vector<pair<ll, ll>> v(n);

        for(ll i = 0; i < n; i++){
            v[i].first = i + 1;
            cin >> v[i].second;
        }

        sort(v.begin(), v.end(), sortbysec);

        ll inc = 1;
        vector<ll> ans(n + 1);
        ans[0] = 0;

        ll res = 0;

        for(ll i = 0; i < n; i += 2){

            ans[v[i].first] = inc;
            res += 2 * abs(inc) * v[i].second;
            if(i + 1 < n){
                ans[v[i + 1].first] = -inc;
                res += 2 * abs(inc) * v[i + 1].second;
            }
            inc++;
        }

        cout << res << endl;
        for(ll i = 0; i < ans.size(); i++) cout << ans[i] << " ";


    }
    return 0;
}