#include <iostream>
using namespace std;

int main() {
	double arr[3][3]={};
	int i,j;
	int maxi = 0;       //int maxi = i
	int maxj = 0;       //int maxj = j
	int favgi = 0;
	int warning = 0;
	double avg = 0.0;
	double favg = 0.0;
	cout<<"enter the values"<<endl;
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			cin>>arr[i][j];
		}
	}

	double max = arr[0][0];
	cout<<"   Room 1    Room2   Room3 "<<endl;
	for(i=0;i<3;i++){
		cout<<"Floor "<<i+1<<" : ";
			for(j=0;j<3;j++){
				cout<<arr[i][j]<<"   ";
			}
			cout<<endl;
		}

	for(i=0;i<3;i++){
			for(j=0;j<3;j++){
					if(arr[i][j]>max){max=arr[i][j];maxi=i;maxj=j;}
					//if(arr[i][j]==max){maxi=i;maxj=j;}
					if(arr[i][j]>=30){warning++;}
				}
		}

	for(i=0;i<3;i++){
				for(j=0;j<3;j++){
						 avg=avg+arr[i][j];
					}
				if(avg>favg){favg=avg;favgi=i;}
				//cout<<"floor avg"<<avg<<endl;
				//cout<<"floor avg in loop"<<favg<<endl;
				avg=0;
			}

	cout<<endl;
	cout<<"Hotest Room   : Floor "<<maxi+1<<", Room "<<maxj+1<<" -> "<<max<<"C"<<endl;
	cout<<"Hottest Floor : Floor "<<favgi+1<<" (avg "<<(favg/3)<<"C)"<<endl;
	cout<<"Rooms at WARNING or above  : "<<warning<<endl;

	return 0;
}
