#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n, h;
        cin >> n >> h;

        vector<ll> a(n, 0);
        for(int i = 0; i < n; i++) cin >> a[i];

        ll ans = 0;
        ll high = 1e18, low = 1;
        while(low <= high){
            ll mid = (high + low)/2;
            ll sum = mid;
            for(int i = 0; i < n - 1; i++){
                sum += min(mid, a[i + 1] - a[i]);
            }

            if(sum < h) low = mid + 1;
            else high = mid - 1;
        }

        cout << high + 1 << endl;

    }
    return 0;
}