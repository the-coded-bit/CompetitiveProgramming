// problem from leetcode weekly contest 275 q1
#include<bits/stdc++.h>
using namespace std;


bool checkValid(vector<vector<int>> matrix){
    int n = matrix.size();
    if(n == 1) return true;
    vector<int> freq_row(n + 1, 0), freq_col(n + 1, 0);

    int a = 1;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(freq_row[matrix[i][j]] == a) return false;
            else{
                freq_row[matrix[i][j]]++;
            }
        }
        a++;
    }

    a = 1;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(freq_col[matrix[j][i]] == a) return false;
            else{
                freq_col[matrix[j][i]]++;
            }
        }
        a++;
    }
    return true;
}

int main(){
    int n;
    cin >> n;
    vector<vector<int>> matrix(n);
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            int in;
            cin >> in;
            matrix[i].push_back(in);
        }
    }

    cout << checkValid(matrix) << endl;


    return 0;
}