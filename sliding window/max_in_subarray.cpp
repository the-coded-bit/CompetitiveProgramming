#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, k;
    cin >> n >> k;

    vector<int> v(n, 0);
    for(int i = 0; i < n; i++) cin >> v[i];

    queue<int> q;

    int j = 0, i = 0;
    while(j < n){
        while(q.size() > 0 && q.front() < v[j]) q.pop();
        q.push(v[j]);
        

        if(j - i + 1 < k) j++;
        else if(j - i + 1 == k){
            cout << q.front() << " ";
            if(q.front() == v[i]) q.pop();
            i++;
            j++;
        }
    }
    return 0;
}