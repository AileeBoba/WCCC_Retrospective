/*
3-ProgChallege15-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>

using namespace std;

int main()
{
	double propValue, assessValue, propTax;

	cout << "Please enter your properties current value. ";
	cin >> propValue;
	assessValue = propValue * 0.6;
	propTax = assessValue / 100 * 0.75;
	cout << "For tax purposes your property is assessed at " << assessValue << endl;
	cout << "Your property tax is " << propTax << endl;
	return 0;
}