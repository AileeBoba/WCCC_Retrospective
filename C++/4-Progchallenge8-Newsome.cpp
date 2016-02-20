/*
4-ProgChallenge8-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

int main()
{
	string color1, color2;
	
	cout	<< "Hello and welcome to The Color Mixer\n"
			<< "this program will show you the results of mixing 2 primary colors.\n"
			<< "Please enter red, blue, or yellow as your first choice: ";
	cin		>> color1;
	cout	<< "Excellent half way there,\nplease enter red, blue or yellow for your second choice: ";
	cin		>> color2;

	// Data Check
	if (!(color1 == "red" || color1 == "blue" || color1 == "yellow"))
		cout << "Invalid entry, please restart the program and try again.\n";
	else if (!(color2 == "red" || color2 == "blue" || color2 == "yellow"))
		cout << "Invalid entry, please restart the program and try again.\n";
	else
		cout << endl << "Calculating, please stand by :" << endl << endl;

	cout << "....." << endl << endl;

	// Calculate
	if ((color1 == "red" && color2 == "blue") || (color1 == "blue" && color2 == "red"))
		cout << "You have created purple." << endl;
	else if ((color1 == "red" && color2 == "yellow") || (color1 == "yellow" && color2 == "red"))
		cout << "You have created orange." << endl;
	else if ((color1 == "blue" && color2 == "yellow") || (color1 == "yellow" && color2 == "blue"))
		cout << "You have created green." << endl;
	else
		cout << "Error in calculations, please restart the program" << endl;
	
	cout << endl;

}