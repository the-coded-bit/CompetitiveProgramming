#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll a, s;
        cin >> a >> s;

        vector<ll> b;
        while(a){
            // cout << "started with s = " << s << " a = " << a << endl;
            ll r1 = s%10;
            ll r2 = a%10;
            s = s/10;
            a = a/10;

            if(r1 - r2 >= 0){
                b.push_back(r1 - r2);
            }
            else{
                ll m = s % 10;
                r1 = r1 + m * 10;
                s = s/10;
                // cout << "converted r1 = " << r1 << endl;
                if(r1 - r2 >= 0){
                    
                    // cout << "entered else if condition" << endl;
                }
                else{
                    // cout << "entered else else condition"<< endl;
                    cout << "-1" << endl;
                }
            }
        }
        cout << b << endl;
    }
    return 0;
}