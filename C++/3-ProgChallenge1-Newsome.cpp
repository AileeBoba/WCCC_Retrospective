/*
3-ProgChallenge1-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>

using namespace std;

int main()
{
	double gallons, miles, mpg;

	cout << "Please enter the number of gallons your vehicle can hold. ";
	cin >>gallons;
	cout << "Please enter the number of miles you can drive on one full tank. ";
	cin >> miles;
	mpg = miles / gallons;
	cout << "Your car gets " << mpg << " miles per gallon of gas. " << endl;
	return 0;
}