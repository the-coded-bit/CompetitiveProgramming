#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n, m;
        cin >> n >> m;

        vector<pair<int, pair<int, int>>> a(m, {0, {0, 0}});

        for(int i = 0; i < m; i++){
            int x, y;
            cin >> x >> y;
            a[i].second.first = x;
            a[i].second.second = i + 1;
            a[i].first = y;
        }

        sort(a.begin(), a.end());

        

        vector<pair<int, int>> v(2*n, {0, 0});

        int res = 0;

        for(int i = 0; i < 2*n; i++){
            res += a[i].first;
            v[i].first = a[i].second.first;
            v[i].second = a[i].second.second;
        }

        sort(v.begin(), v.end());


        cout << res << endl;
        vector<pair<int, int>> ans;
        int i = 0, j = v.size() - 1;
        while(i < n){
            ans.push_back({v[i].second, v[j].second});
            i++;
            j--;
        }

        for(int i = 0; i < ans.size();i++){
            cout << ans[i].first << " " << ans[i].second << endl;
        }
        
    }
    return 0;
}