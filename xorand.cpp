#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin>> n;
        vector<int> v(n, 0);
        for(int i = 0; i < n; i++) cin >> v[i];

        vector<int> msb(32, 0);
        for(int i = 0; i < 32; i++){
            for(int j = 0; j < n; j++){
                int val = v[j] & (int)pow(2, i);
                if(val) msb[i]++;
            }
        }

        int ans = 0;
        for(int i = 0; i < 32; i++){
            ans += (msb[i] * (msb[i] - 1))/2;
        }
        cout << ans/2 << "\n";
    }
    return 0;
}