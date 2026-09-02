#include <iostream>
using namespace std;


double reorderCost(int qty,double unitPrice){        //int
	return qty*unitPrice;
}

double reorderCost(double qty, double unitPrice) {     //frac
    return qty*unitPrice;
}

double reorderCost(int qty,double unitPrice,double taxRate) {    //with tax
    double cost = qty*unitPrice;
    return cost + (cost*taxRate / 100);
}

double applyDiscount(double price,double discountPercent =10.0) {    //defaulrt
    return price - (price* discountPercent / 100);
}

int main() {

    cout << "Integer quantity cost: "
         << reorderCost(10, 250.0) << endl;


    cout<<"Fractional quantity cost: "
        <<reorderCost(10.5,250.0) <<endl;

    cout<< "Cost with tax: "
         <<reorderCost(10,250.0,18.0) <<endl;

    cout<<"Price after default 10% discount: "
         <<applyDiscount(1000)<< endl;

    cout  <<"Price after 20% discount: "
         <<applyDiscount(1000,20.0) <<endl;




    return 0;
}
