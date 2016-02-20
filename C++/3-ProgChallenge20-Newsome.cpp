/*
3-ProgChallenge20-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

int main()
{
	double zaDiameter, zaRadius, zaArea, zaSlices, pi;

	pi = 3.14159;

	cout << "Please enter the diameter of your pizza in inches: ";
	cin >> zaDiameter;
	zaRadius = zaDiameter / 2;
	zaArea = pi * pow(zaRadius, 2);
	zaSlices = zaArea / 14.125;
	cout << setprecision(1) << fixed;
	cout << "Your pizza should have " << zaSlices << " slices." << endl;
	cout << "Enjoy!" << endl;
	return 0;
}