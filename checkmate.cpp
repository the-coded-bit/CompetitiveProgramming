#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ios::sync_with_stdio(0);
    cin.tie(NULL);

    ll t;
    cin >> t;

    while(t--){
        ll xk, yk, x1, y1, x2, y2;
        cin >> xk >> yk >> x1 >> y1 >> x2 >> y2;

        //if king is in file one along x-axis
        if(yk == 1){
            if(y1 == 2 || y2 == 2){

                if((x1 == xk -1 || x1 == xk + 1) || (x2 == xk - 1 || x2 == xk + 1)){
                    cout << "No" << "\n";
                }
                else{
                    if(x1 == x2){
                        cout << "No" << "\n";
                    }
                    else{
                        cout << "Yes" << "\n";
                    }
                }
            }
            else{
                cout << "No" << "\n";
            }
        }
        else if(yk == 8){
            if(y1 == 7 || y2 == 7){

                if((x1 == xk -1 || x1 == xk + 1) || (x2 == xk - 1 || x2 == xk + 1)){
                    cout << "No" << "\n";
                }
                else{
                    if(x1 == x2){
                        cout << "No" << "\n";
                    }
                    else{
                        cout << "Yes" << "\n";
                    }
                }
            }
            else{
                cout << "No" << "\n";
            }
        }
        else if(xk == 1){
            if(x1 == 2 || x2 == 2){
                if((y1 == yk -1 || y1 == yk + 1) || (y2 == yk - 1 || y2 == yk + 1)){
                    cout << "No" << "\n";
                }
                else{
                    if(y1 == y2){
                        cout << "No" << "\n";
                    }
                    else{
                        cout << "Yes" << "\n";
                    }
                }
            }
        }
        else if(xk == 8){
            if(x1 == 7 || x2 == 7){
                if((y1 == yk -1 || y1 == yk + 1) || (y2 == yk - 1 || y2 == yk + 1)){
                    cout << "No" << "\n";
                }
                else{
                    if(y1 == y2){
                        cout << "No" << "\n";
                    }
                    else{
                        cout << "Yes" << "\n";
                    }
                }
            }
        }
        else{
            cout<< "No" << "\n";
        }
    }

    return 0;
}