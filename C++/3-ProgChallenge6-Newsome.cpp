/*
3-Progchallenge6-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>

using namespace std;

int main()
{
	double sugar, sugarNeeded, butter, butterNeeded, flour, flourNeeded, cookies;

	sugar = 1.5 / 48;
	butter = 1.0 / 48;
	flour = 2.75 / 48;

	cout << "Please enter the number of cookies you would like to make. ";
	cin >> cookies;
	sugarNeeded = cookies * sugar;
	butterNeeded = cookies * butter;
	flourNeeded = cookies * flour;

	cout << "For " << cookies << " you will need:\n";
	cout << sugarNeeded << " cups of sugar.\n";
	cout << butterNeeded << " cups of butter.\n";
	cout << "and " << flourNeeded << " cups of flour.\n";
	cout << "Happy baking!" << endl;
	return 0;
	
}