#include <bits/stdc++.h>
using namespace std;

vector<vector<int>> neighbourInfluence(vector<vector<int>> &matrix){
    vector<vector<int>> ans(matrix.size(), vector<int> (matrix[0].size()));
    int n = matrix.size();
    int m = matrix[0].size();

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(i - 1 >= 0 && i - 1 < n)
                ans[i][j] += matrix[i - 1][j];

            if(i + 1 >= 0 && i + 1 < n)
                ans[i][j] += matrix[i + 1][j];
            if(j - 1 >= 0 && j - 1 < m)
                ans[i][j] += matrix[i][j - 1];
            if(j + 1 >= 0 && j + 1 < m)
                ans[i][j] += matrix[i][j + 1];           
        }
    }

    return ans;

}

int main(){
    int n = 2, m = 3;
    vector<vector<int>> arr = {{7, 9, 1}, {0, 7, 9}};

    vector<vector<int>> ans = neighbourInfluence(arr);
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cout << ans[i][j] << " ";
        }

        cout << endl;
    }
    return 0;
}