#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, q;
    cin >> n >> q;
    
    vector<int> v(n + 1, 0);
    vector<vector<int>> p(q, vector<int> (3, 0));

    for(int i = 0;  i < q; i++){
        int val1, val2, val3;
        cin >> val1 >> val2 >> val3;
        p[i][0] = val1- 1 ;
        p[i][1] = val2 - 1;
        p[i][2] = val3;
    }

    for(int i = 0; i < q; i++){
        int idx1 = p[i][0];
        int idx2 = p[i][1];
        int val = p[i][2];

        v[idx1] += val;
        v[idx2 + 1] += -1*val;

    }
    int maxi = INT_MIN;

    for(int i = 1; i < n; i++){
        v[i] = v[i] + v[i - 1];
        maxi = max(v[i], maxi);
    }
    cout << maxi << endl;


}