#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;

namespace Physics {
 	 double clamp(double val, double min, double max){
 		 if(max<min){"Invalid";return 0;}
 		 cout<<"clamp physics"<<endl;
 		 if(val<min){return min;}
 		if(val>max){return max;}
 		 return val;
 	 }
 	 double lerp(double a, double b, double t){
 		 cout<<"lerp physics"<<endl;
 		return a + (b - a) * t;
 	 }

}
namespace GameMath {
 	 int clamp(int val, int min, int max){
 		if(max<min){"Invalid";return 0;}
 		 		 cout<<"clamp math"<<endl;
 		 		 if(val<min){return min;}
 		 		if(val>max){return max;}
 		 		 return val;
 	 }
 	 double lerp(double a, double b, double t){
 		 		 cout<<"lerp math"<<endl;
 		 		return a + (b - a) * t;
 	 }
}


class Entity{
	string name;
	int health;
	int level;
	string type;

public:


	Entity& setName(const string& name){
		this->name=name;
	return *this;
	}

	Entity& setHealth(int health){
		this->health=health;
	return *this;
	}

	Entity& setLevel(int level){
		this->level=level;
	return *this;
	}

	Entity& setType(const string& type){
		this->type=type;
	return *this;
	}



	string getName() const{
	return name;}

	int getHealth() const{
	return health;}

	int getLevel() const{
	return level;}

	string getType() const{
	return type;}

	void displayInfo() const{
		cout<<"Name   : "<<name<<endl;
		cout<<"Health : "<<health<<endl;
		cout<<"Level  : "<<level<<endl;
		cout<<"Type   : "<<type<<endl;
		cout<<endl;
	}

};

int main() {
	Entity Player;
	Player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");

	Entity Enemy;
	Enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");

	Entity Item;
	Item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

	Player.displayInfo();
	Enemy.displayInfo();
	Item.displayInfo();

	Physics::clamp(20.5,0.0,50.0);
	Physics::lerp(2.9,2.36,0.5);

	GameMath::clamp(19,2,21);
	GameMath::lerp(2.90,24.36,0.4);


	int R, C;
	int Grass=0;
	int Water=0;
	int Mountain=0;
	int Forest=0;
	int Dungeon=0;

		cout<<"Enter the rationfor game map : R and C"<<endl;
		cin>>R>>C;

		int** maparr = new int*[R];

		for(int i=0;i<R;i++){
			maparr[i] = new int[C];
			for(int j = 0; j < C; j++){
				maparr[i][j] = (rand() % 5);
			}
		}

	cout<<"===== GAME MAP ("<<R<<" x "<<C<<") ====="<<endl;
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				cout<<maparr[i][j]<<" ";
				if(maparr[i][j]==0){Grass++;}
				else if(maparr[i][j]==1){Water++;}
				else if(maparr[i][j]==2){Mountain++;}
				else if(maparr[i][j]==3){Forest++;}
				else {Dungeon++;}
			}
			cout << endl;
		}
		cout<<"Legend: 0=Grass  1=Water  2=Mountain  3=Forest  4=Dungeon"<<endl;
		cout<<endl;
		cout<<"Tile Count:"<<endl;
		cout<<"   Grass    : "<<Grass<<endl;
		cout<<"   Water    : "<<Water<<endl;
		cout<<"   Mountain : "<<Mountain<<endl;
		cout<<"   Forest   : "<<Forest<<endl;
		cout<<"   Dungeon  : "<<Dungeon<<endl;


	return 0;


}
