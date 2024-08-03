#include<bits/stdc++.h>
using namespace std;
void swap(char a[],int z,int l,int i){
char tem=a[l];
a[l]=a[i];
a[i]=tem;
}
void permutation(char a[],int z,int l,int r){
    if(l==r){
        cout<<a<<endl;
    }
    else{
        for(int i=l;i<=r;i++){
            swap(a,z,l,i);
            permutation(a,z,l+1,r);
            swap(a,z,l,i);
        }
    }
}
int main(){
string s;
cin>>s;
char a[s.size()+1];
int z=s.size()+1;
int l=0,r=s.size()-1;
strcpy(a,s.c_str());
permutation(a,z,l,r);}
