#include <iostream>
#include <string>
using namespace std;

class Products{
	int ProductId,quantity;
	string name;
	double price;

public:
	void acceptdetails(){
		cin>>ProductId;
		cin>> name;
		cin>> price;
		cin>> quantity;
	}

	void displayDetails()const{
	  //cout << "ID     Name          Price       Qty      Total Value" << endl;
		cout<<ProductId<<"   "
				<<name<<"    "
				<<price<<"    "
				<<quantity<<"    "
				<<totalValue();
	}

	double totalValue()const{
		return quantity*price;
	}

	bool islowStock(int threshold)const{
		if(quantity<threshold){return true;}
		else{return false;}
	}

	string getName() const {
	    return name;
	}


};

int main() {
	int threshold=10;
	Products arr[5];
	cout<<"Enter the products"<<endl;
		for(int i=0;i<5;i++){
			arr[i].acceptdetails();
		}
	cout<<"======= INVENTORY REPORT ======="<<endl;
	cout << "ID     Name          Price       Qty      Total Value" << endl;

		for(int i=0;i<5;i++){
					arr[i].displayDetails();
				if(arr[i].islowStock(10)) {
					   cout << "      <- LOW STOCK";}
				  cout << endl;
				}

		int highval=0;
		for(int i=0;i<5;i++){
			if(arr[i].totalValue() > arr[highval].totalValue()) {
			        highval = i;}
		}
		cout<<""<<endl;


		cout<<"Highest Value Product : "<<arr[highval].getName();
		cout<<" (Rs. "<<arr[highval].totalValue()<<")"<<endl;
		cout<<"Low Stock (threshold: 10) : ";
		for(int i = 0; i < 5; i++) {
		    if(arr[i].islowStock(10)) {
		        cout<<arr[i].getName()<<", ";
		    }
		}
		cout<<""<<endl;
	return 0;

}


//1001 Widget-A 250.00 120
//1002 Bolt-B 15.50 8
//1003 Widgets-B 2.3 65
//1004 Bolt-A 22.3 2
//1005 other 33.5 5
