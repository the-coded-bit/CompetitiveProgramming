#include <bits/stdc++.h>
using namespace std;
// this question is asked in accolite, samsung, amazon, snapdeal
// the question is to  find the smallest positive number missing in an array
int main() {
    const int N = 1e6+2;

    vector<int> element_occur(N,0);
    vector<int> v;

    int n,min_pos = -1;
    cin >> n;

    for (int  i = 0; i < n; i++)
    {
        /* code */
        int a;
        cin >> a;
        v.push_back(a);
    }

    for(int i = 0; i < v.size(); i++) {
        if(v[i] >= 0)
        element_occur[v[i]]++;
    }

    for(int i = 0; i < element_occur.size(); i++) {
        if(element_occur[i] == 0){
            min_pos = i;
            break;
        }
    }
    cout << min_pos;
    
    return 0;
}