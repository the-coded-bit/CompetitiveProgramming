#include <bits/stdc++.h>
using namespace std;

//this is the question based on left rotation of the array
int main(){
    vector<int> v = {1,2,3,4,5};
    int d = 4;
    
    vector<int> ans(v.size());
    for(int i = 0; i < v.size(); i++) {
        ans[i] = v[(i+d)%v.size()];
    }

    for(int i: ans){
        cout << i << " ";
    }

    return 0;
}