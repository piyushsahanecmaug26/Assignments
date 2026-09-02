#include <iostream>
using namespace std;

int main() {

	int statusReg = 0b10110001;
	int control =   0b00000000;
	int dataReg  =  0b11001010;

	const int* regPtr1 = &statusReg;         //pointer regptr 1 pointing ststus
	int* const regPtr2 = &control;           //pointer regptr 2 pointing control
	const int* const regPtr3 = &dataReg;     //pointer regptr 3 pointing data

	cout<<" "<<statusReg<<endl;
	cout<<" "<<*regPtr1<<endl;
	cout<<" "<<regPtr1<<endl;

//----------------------------------------------------------------
	regPtr1=12;           //error: invalid conversion from 'int' to 'const int*' [-fpermissive]

//------------------------------------------------------------------
	*regPtr2=32;
	cout<<" "<<control<<endl;       //here the value of control is changed but
	regPtr2 = &dataReg;             //the address is chenged
	cout<<" "<<regPtr2<<endl;       //error: assignment of read-only variable 'regPtr2'

//-------------------------------------------------------------------
	regPtr3 =50;                   // error: assignment of read-only variable 'regPtr3'
	regPtr3 = &statusReg;        // error: assignment of read-only variable 'regPtr3'

	return 0;
}
