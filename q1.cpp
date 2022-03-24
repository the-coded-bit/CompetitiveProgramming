#include <bits/stdc++.h>
using namespace std;

int main()
{

    vector<int> arr = {2, -5, 2};
    vector<int> prefix(arr.size() + 1, 0);

    for (int i = 0; i < arr.size(); i++)
    {
        prefix[i + 1] = arr[i] + prefix[i];
    }

    for (int i = 0; i < prefix.size(); i++)
    {
        cout << prefix[i] << " ";
    }
    cout << endl;
    int maxi = INT_MIN, center = 0;
    for (int i = 0; i < arr.size(); i++)
    {
        if(i - 1 == -1){
            maxi = max(maxi, center + prefix[i]);
            center = arr[i];
        }
        else{
            maxi = max(maxi, max(center + prefix[i], center + prefix[i - 1]));
            center = center + prefix[i];
        }
        cout << center << " " << center + prefix[i] << " " << center + prefix[i - 1] << endl;
        
        cout << "center = " << center << endl;
    }
    cout << maxi << endl;

    return 0;
}