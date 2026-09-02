#include <iostream>
#include<string>
using namespace std;

class Patient{
	int patientId;
	string name;
	int age;
	string ward;
	const string bloodGroup;
public:

	Patient():bloodGroup("O+"){
		patientId=0;
		name="Unknown";
		age=0, ward="General";
		//bloodGroup="O+";
		cout<<"[constructor] Default patient Registered."<<endl;
	}

	Patient(int patientId, const string& name)
	:patientId(patientId),name(name),bloodGroup("O+"){

		cout<<"[constructor] Emergency: "<<name;
	}

	Patient(int patientId, const string& name, int age, const string& ward, const string&bg)
			:patientId(patientId),name(name),age(age),ward(ward),bloodGroup(bg){

		cout<<"[constructor] Full Admission: "<<name<<endl;
	}

	~Patient(){
		cout<<"[Destructor] Patient "<<name<<" discharged."<<endl;
	}

	void displayRecord(){
		cout<<""<<endl;
		cout<<"Patient Record:"<<endl;
		    cout << "ID           : " << patientId << endl;
		    cout << "Name         : " << name << endl;
		    cout << "Age          : " << age << endl;
		    cout << "Ward         : " << ward << endl;
		    cout << "Blood Group  : " << bloodGroup << endl;
	}
	void transferWard(const string& newWard){
		ward = newWard;
			cout<<"Ward Transfer: "<<name<<"->"<<newWard<<endl;
	}

};

int main() {
	Patient pat;
	Patient patemer(1001,"piyush");
	Patient patfull(1002,"Meera joshi",34,"Cardiology","B+");
	patfull.displayRecord();

	cout<<endl;

	int numpat=4;
	Patient* patarr = new Patient[numpat];
		for(int i=0;i<4;i++){
			patarr[i].displayRecord();
		}
		cout<<endl;

		patemer.transferWard("ICU");
		cout<<endl;

		delete[] patarr;

	return 0;
}
