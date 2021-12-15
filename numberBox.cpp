#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ll t;
    cin >> t;
    while (t--)
    {
        /* code */
        int n, m;
        cin >> n >> m;

        vector<vector<int>> v(n);

        ll sum = 0, mini = 10000, negative_count = 0;
        for(ll i = 0; i < n; i++){
            for(ll j = 0; j < m; j++){

                ll in;
                cin >> in;

                if(in < 0) negative_count++;

                mini = min(mini, abs(in));

                sum += abs(in);

                v[i].push_back(in);
            }
        }

        if(negative_count%2 == 0){
            cout << sum << "\n";
        }
        else{
            ll res = sum - 2 * mini;
            cout << res << "\n";
        }
    }
    
    return 0;
}