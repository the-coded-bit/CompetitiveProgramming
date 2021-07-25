#include <bits/stdc++.h>
using namespace std;

int combo(vector<int> &arr, int idx, int tar, vector<vector<int>>& dp)
{
    if (idx == arr.size())
    {
        if (tar == 0)
            return dp[idx][tar] = 1;
        else
            return dp[idx][tar] = 0;
    }
    else if (tar < 0)
        return dp[idx][tar] = 0;

    if(dp[idx][tar] != 0)
        return dp[idx][tar];    

    int acc = combo(arr, idx, tar - arr[idx], dp);
    int n_acc = combo(arr, idx + 1, tar, dp);
    int ans = acc + n_acc;

    return dp[idx][tar] = ans;
}

int main()
{
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; i++)
    {
        int in;
        cin >> in;
        arr[i] = in;
    }

    int tar;
    cin >> tar;
    vector<vector<int>> dp(n, vector<int>(tar + 1));
    int ans = combo(arr,0,tar,dp);
    cout << ans << "\n";
    for (int i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j <= tar; j++)
            cout << dp[i][j] << " ";
        cout << "\n";
    }

    return 0;
}

