#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        vector<ll> a(n);
        for(int i = 0; i < n; i++) cin >> a[i];

        //corner cases
        if(n == 1){
            cout << a[0] << "\n";
            continue;
        }
        else if(n == 2){
            if(a[1] < a[0]){
                cout << a[1] << " " << a[0] << "\n";
            }
            else{
                cout << a[0] << " " << a[1] << "\n";
            }
            continue;
        }

        deque<ll> dq;
        dq.push_front(a[0]);
        for(int i = 1; i < n; i++){
            if(a[i] < dq.front()){
                dq.push_front(a[i]);
            }
            else{
                dq.push_back(a[i]);
            }
        }

        for(auto it : dq){
            cout << it << " ";
        }
        cout << "\n";
    }
    return 0;
}