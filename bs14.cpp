//Find index of 1st 1 in binary sorted Infinite array

// problem- first occurence + infinite sorted array

#include <iostream>
using namespace std;

int firstOccurence(int a[],int start, int end,int target){
    int res=-1;
    while(start<=end){
        int mid= start+(end-start)/2; 
        if(a[mid]==target){
            res=mid;
            end=mid-1;
        }
        else if (a[mid]> target) end= mid-1;
        else start=mid+1;
    }
    return res;
    
}

int solve(int a[]){
    int start= 0,end=1;
    while(a[end]<1){
        start=end;
        end= end*2;
    }
    return firstOccurence(a,start,end,1);

}
int main(){
    int a[]= {0,0,0,0,1,1,1,1,1,1};
    cout << solve(a) << endl;
}
