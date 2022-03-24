#include <bits/stdc++.h>
using namespace std;

string havefun(string s){
    map<char, vector<char>> mp;
    mp['1'] = {',', '@'};
    mp['2'] = {'A','B', 'C', 'a', 'b', 'c', '2'};
    mp['3'] = {'D', 'E', 'F', 'd', 'e', 'f', '3'};
    mp['4'] = {'G', 'H', 'I', 'g', 'h', 'i', '4'};
    mp['5'] = {'J', 'K', 'L', 'j', 'k', 'l', '5'};
    mp['6'] = {'M', 'N', 'O', 'm', 'n', 'o', '6'};
    mp['7'] = {'P', 'Q', 'R', 'S', 'p', 'q', 'r', 's', '7'};
    mp['8'] = {'T', 'U', 'V', 't', 'u', 'v', '8'};
    mp['9'] = {'W', 'X', 'Y', 'Z', 'w', 'x', 'y', 'z', '9'};
    mp['0'] = {' ', '0'};

    s = s + ' ';
    string temp, ans;
    temp = s[0];
    for(int i = 1; i < s.size(); i++){
        cout << "char at i = " << i << " " << s[i] << endl;
         if(s[i] == s[i - 1]) temp += s[i];
        else{
            cout << temp << endl;
            int n = temp.size();
            char pressed = temp[0];
            n = n% mp[pressed].size();

            ans += mp[pressed][n - 1];
            temp = "";
            if(s[i] != '_') temp += s[i];
            else{
                temp += s[i + 1];
                i++;
            }
        }
    }
    return ans;
}

int main(){
    int n;
    cin >> n;
    while(n--){
        string s;
        cin >> s;
        cout << havefun(s) << endl;
    }
    return 0;
}