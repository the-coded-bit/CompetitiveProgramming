#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;

    while(t--){
        int n;
        cin >> n;
        vector<int> a(n, 0);

        int sum = 0;

        for(int i = 0; i < n; i++){
            cin >> a[i];
            sum += a[i];
        }

        if(n == 3 && a[1]%2){
            cout << -1 << endl;
            continue;
        }
        
        if(sum - a[0] - a[n - 1] == n - 2){
            cout << -1 << endl;
            continue;
        }

        int res = 0;
        for(int i = 1; i < n - 1; i++){
            if(a[i]%2) res += (a[i] + 1)/2;
            else res += a[i]/2;
        }
        cout << res << endl;

    }
    return 0;
}