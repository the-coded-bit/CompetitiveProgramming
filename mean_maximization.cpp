#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while (t--)
    {
        /* code */
        int n;
        cin >> n;
        vector<int> arr(n, 0);
        for(int i = 0; i < n; i++) cin >> arr[i];
        int sum = 0, maxi = INT_MIN;
        for(int i = 0; i < n; i++){
            maxi = max(maxi, arr[i]);
            sum += arr[i];
        }
        sum = sum - maxi;
        double ans = sum / (n - 1) + maxi;
        cout << ans << "\n";
    }
    
    return 0;
}