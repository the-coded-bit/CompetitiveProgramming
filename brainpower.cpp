// solved DP based problem weekly contest 276 q3 first DP question by itself :> 
#include<bits/stdc++.h>
using namespace std;

long long mostPoints(vector<vector<int>>& questions) {
        int n = questions.size();
        
        vector<long long> maxi(n , 0);
        vector<long long> ans(n, 0);
        
        maxi[n - 1] = questions[n - 1][0];
        ans[n - 1] = questions[n - 1][0];
        
        for(int i = n - 2; i >= 0; i--){
            
            int points = questions[i][0];
            int brainpower = questions[i][1];
            
            if(i + brainpower + 1 >= n){
                ans[i] = points;
            }
            else {
                ans[i] = max(points + ans[i + brainpower + 1], points + maxi[i + brainpower + 1]);
            }
            
            maxi[i] = max(ans[i], maxi[i + 1]);
        }
        
        return maxi[0];
    }

int main(){
    int n;
    cin >> n;

    vector<vector<int>>questions (n , vector<int>(2, 0));
    for(int i = 0; i < n; i++){
        for(int j = 0; j < 2; j++){
            cin >> questions[i][j];
        }
    }

    cout << mostPoints(questions);
}