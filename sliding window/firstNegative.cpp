// to find first negative number in k size window
#include<bits/stdc++.h>
using namespace std;

int main(){
    int k, n;
    cin >> k >> n;

    vector<int> v(n, 0);
    for(int i = 0; i < n;  i++) cin >> v[i];

    queue<int> q;
    int i = 0, j = 0;

    while(j < n){
        if(v[j] < 0){
            q.push(v[j]);
        }
        if(j - i + 1 < k) j++;
        else if(j - i + 1 == k){
            if(q.empty() == true) cout << "0 ";
            else{
                cout << q.front() << " ";
            }

            if(q.front() == v[i]){
                q.pop();
            }
            i++;
            j++;
        }
    }
    return 0;
}