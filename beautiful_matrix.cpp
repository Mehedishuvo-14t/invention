#include<bits/stdc++.h>
using namespace std;
int main(){
int a[5][5];
int i,j,tem,rem,count=0;
for(i=0;i<5;i++){
    for(j=0;j<5;j++){
        cin>>a[i][j];
    }
}
for(i=0;i<5;i++){
    for(j=0;j<5;j++){
            if(a[i][j]==1){
                tem=i;
                rem=j;
            }
    }
}
if(tem<=2){
    for(i=tem;i<=2;i++){
        if(i!=2){
            count++;
        }

    }
}
else
{

    for(i=tem;i>=2;i--){
        if(i!=2){
            count++;
        }

    }
}
if(rem<=2){
    for(i=rem;i<=2;i++){
        if(i!=2){
            count++;
        }

}
}
else
{

    for(i=rem;i>=2;i--){
        if(i!=2){
            count++;
        }

    }
}
cout<<count;
}

