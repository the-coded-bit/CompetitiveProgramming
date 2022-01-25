#include <bits/stdc++.h>
using namespace std;

int getDistinctPrimeCnt(int m){
    int temp = m;
    int cnt = 0;
    for(int i = 2; i * i <= m; i++){
        bool changed = false;
        while(temp % i == 0){
            if(changed == false){
                cnt++;
                changed = true;
            }
            temp = temp / i;
        }
    }
    if(temp != 1) cnt++;
    return cnt;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n, m;
        cin >> n >> m;

        int cnt = getDistinctPrimeCnt(m);

        if(cnt == 0) cout << "0\n";

        for(int i = cnt; i > 0; i--){
            if(n % i == 0){
                cout << i << "\n";
                break;
            }
        }
    }
    return 0;
}