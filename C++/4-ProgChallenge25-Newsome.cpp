/*
4-ProgChallenge25-Newsome
Gary A. Newsome
CPT 180_28 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <iomanip>
#include <string>

using namespace std;
int main()
{
	const double	dblPACKAGE_A = 39.99,
					dblPACKAGE_B = 59.99,
					dblPACKAGE_C = 69.99;
	char charCustPkg;
	double dblMin, dblAddMin;
	double dblYourBill;

	// Get customer information
	cout	<< "Hello, please choose your plan from the following menu:" << endl << endl;
	cout	<< "\tPress 'A' for Package A: $39.99 a month, \n\t\tfor 450 minutes, $0.45 for each additional minute.\n "
			<< "\tPress'B' for Package B: $59.99 a month, \n\t\tfor 900 minutes, $0.40 for each additional minute.\n "
			<< "\tPress 'C' for Package C: $69.99 a month, \n\t\tfor unlimited minutes.\n" << endl << endl;
	cout << "Please enter your package here: ";
	cin >> charCustPkg;
	
	cout << "How many minutes did you use this month? ";
	cin >> dblMin;

	cout << fixed << showpoint << setprecision(2) << endl << endl;

	switch (toupper(charCustPkg))
	{
	case 'A':
		cout << "You entered package 'A' " << endl << endl;
		if (dblMin <= 450)
			cout << "Your monthly bill is $" << dblPACKAGE_A << endl << endl;
		else
		{
			dblAddMin = (dblMin - 450) * 0.45;
			dblYourBill = dblPACKAGE_A + dblAddMin;
			cout << "Your bill this month is $" << dblYourBill << endl << endl;
		}
		break;
	case 'B':
		cout << "You entered package 'B' " << endl << endl;
		if (dblMin <= 900)
			cout << "Your monthly bill is $" << dblPACKAGE_B << endl << endl;
		else
		{
			dblAddMin = (dblMin - 900) * 0.4;
			dblYourBill = dblPACKAGE_B + dblAddMin;
			cout << "Your bill this month is $" << dblYourBill << endl << endl;
		}
		break;
	case 'C':
		cout << "You entered package 'C' " << endl << endl;
		cout << " Your monthly bill is $" << dblPACKAGE_C << endl << endl;
		break;
	default: cout << "You did not enter A, B, or C. Please restart the program and try again.";
	}
	return 0;


}