#include<iostream>
using namespace std;
//this is the question to find first and last index of element in a sorted arrays

int main(){
    int arr[] = {1,5,10,15,22,33,33,33,33,33,40,42,55,66,77};
    int data = 33;
    int high = 0, low = 14, mid;
    while(high <= low) {
        
        mid = (high + low)/2;

        if(arr[mid] > data){
             high = mid + 1;
        }
        if(arr[mid] < data){
            low = low - 1;
        }

        if(arr[high] == data && arr[low] == data){
            cout << high << "\n" << low;
            break;
        }        

        if(arr[high] <= data)
            high = high + 1;
        if(arr[low] >= data)
            low = low - 1;    
    }
    return 0; 
}