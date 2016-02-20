/*
4-ProgChallenge12-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
	const double dblPACKAGE_PRICE = 99.00;
	int intQuantity;
	double dblDiscAmt, dblNetPrice, dblSalePrice;

	cout << "Please enter the total number of packages you wish to purchase today. ";
	cin >> intQuantity;
	cout << fixed << showpoint << setprecision(2);

	if (intQuantity <= 0)
		cout << "\tInvalid entry, please restart the program and try again.\n";
	else if (intQuantity <= 10)
		dblDiscAmt = 0.0;
	else if (intQuantity <= 19)
		dblDiscAmt = 0.2;
	else if (intQuantity <= 49)
		dblDiscAmt = 0.3;
	else if (intQuantity <= 99)
		dblDiscAmt = 0.4;
	else
		dblDiscAmt = 0.5;

	dblNetPrice = dblPACKAGE_PRICE * intQuantity;
	dblSalePrice = dblNetPrice - (dblNetPrice * dblDiscAmt);
	cout << endl << endl;
	cout << "\tYour total sales price is $" << dblSalePrice << endl << endl << endl;

		return 0;
}