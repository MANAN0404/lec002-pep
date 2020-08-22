#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int ans=0;
    int r;
    while(n>0){
        r=n%10;
       n=n/10;
       ans= r + ans*10;
    }

  cout<< " ans " <<ans;
    return 0;
}