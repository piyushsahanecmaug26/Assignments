//============================================================================
// Name        : 4.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

//og
void resetSensorPairV1(int r1,int r2){
	cout<<"before : A="<<r1<<"  B="<<r2<<endl;
	int temp=r1;
	r1=r2;
	r2=temp;
}

//fix1 cal by ref
void resetSensorPairV2(int &r1,int &r2){
	cout<<"before : A="<<r1<<"  B="<<r2<<endl;
	int temp=r1;
	r1=r2;
	r2=temp;
}

//fix2 call by pointer
void resetSensorPairV3(int* r1,int* r2){
	cout<<"before : A="<<*r1<<"  B="<<*r2<<endl;
		int temp=*r1;
		*r1=*r2;
		*r2=temp;
}

int main() {
	int reading1 = 11;
	int reading2 = 20;

	cout << "----V1: Call by value -----" << endl;
	resetSensorPairV1(reading1,reading2);
	cout<<"After  : A="<<reading1<<"  B="<<reading2<<endl;

	cout << "----V2: Call by reference -----" << endl;
	resetSensorPairV2(reading1,reading2);
	cout<<"After  : A="<<reading1<<"  B="<<reading2<<endl;

	cout << "----V3: Call by pointer -----" << endl;
	resetSensorPairV3(&reading1,&reading2);
	cout<<"After  : A="<<reading1<<"  B="<<reading2<<endl;

	return 0;
}
