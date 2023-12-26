#include <bits/stdc++.h>
// using namespace std;
// void printvec( vector<int>&v)
// {cout<<"size : "<<v.size()<<endl;
//     for (int i=0; i<v.size(); ++i)
// {
// cout<<"{"<<v[i]<<"}";
// }cout<<endl;

// }
// int main(){
//     int N ;
//     cout<<" how amny vectors do you want";
// cin>>N;//3
// vector <int> v[N];
// for (int i =0; i<N; i++)
// {cout<<"how many elements : ";
//     int n ;
//     cin>>n;
//     for(int j =0; j<n; j++)
//     {
//         int x;
//         cin>>x;
//         v[i].push_back(x);
//     }
// }for(int i=0; i<N; i++){
//     printvec(v[i]);
// }
// }
// Algorithm to find the number of products out of N for which the discount will be distributed

// Input: numOfProducts, order, disAmount
// Output: count

#include <iostream>
using namespace std;

int main() {

  // Declare and read numOfProducts
  int numOfProducts;
  cin >> numOfProducts;

  // Declare and read order array
  int order[numOfProducts];
  for (int i = 0; i < numOfProducts; i++) {
    cin >> order[i];
  }

  // Declare and read disAmount
  int disAmount;
  cin >> disAmount;

  // Initialize count to zero
  int count = 0;

  // Loop through each product type
  for (int i = 0; i < numOfProducts; i++) {

    // If the order of the product type is positive
    if (order[i] > 0) {

      // Subtract the discount amount from the order
      order[i] -= disAmount;

      // If the order is still positive or zero
      if (order[i] >= 0) {

        // Increment count by one
        count++;
      }
    }
  }

  // Print count
  cout << count << endl;

  return 0;
}
