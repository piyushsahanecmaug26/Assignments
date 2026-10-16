//============================================================================
// Name        : a.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
#include <memory>

using namespace std;
class Texture{
	string name;

	int width;
	int height;

public:
	Texture(string name,int width,int height):name(name),width(width),height(height){
//		this->name=name;
//		this->width=width;
//		this->height=height;
		cout<<"Texture Loaded"<<endl;

	}
	~Texture(){
		cout<<"Texture Released"<<endl;
	}

	void display()const{
		cout<<"player name "<<name<<" "<<width<<" "<<height<<endl;
	}
};

class Shader{
	string name;
	string type;
public:
	Shader(string name,string type){
		cout<<"[Shader compiled]"<<endl;
	}
	~Shader(){
		cout<<"[Shader Destroyed]"<<endl;
	}
	int getReferenceCount(const shared_ptr<Shader>& shader)
	    {
	        return shader.use_count();
	    }
};

class AudioClip{
	string clip;
public:
	AudioClip(string clip,double vol):clip(clip){
			cout<<"[Clip 1]"<<endl;
		}

	~AudioClip(){
			cout<<"[Clip destroyed]"<<endl;
		}
	string getname(){
		//cout<<"the string"<<clip;
		return clip;
	}
};
int main() {

	shared_ptr<AudioClip> audio = make_shared<AudioClip>("explosin",3.5);
	weak_ptr<AudioClip> observer = audio;

	if(shared_ptr<AudioClip> clip=observer.lock())
		cout<<"Clip alive : "<<clip->getname()<<endl;

	audio.reset();

	if(observer.expired())
		cout<<"Clip already unlock."<<endl;



	 auto sha = make_shared<Shader>("main_vert", "vertex");
	    cout << "Ref count: " << sha.use_count() << endl;
	    {
	        auto rendererRef = sha;
	        cout << "Ref count: " << sha.use_count() << endl;

	        auto editorRef = sha;
	        cout << "Ref count: " << sha.use_count() << endl;
	    }
	    cout << "Ref count: " << sha.use_count() << endl;




	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	auto t1 = make_unique<Texture>("player_sprite",512,512);
	t1->display();

	unique_ptr<Texture> t2 = move(t1);
	cout << "text is null: "<<(t1 == nullptr ? "yes":"no")<<endl;

	return 0;
}
