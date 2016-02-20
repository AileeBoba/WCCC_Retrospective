/*
3-ProgChallenge18-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County communtiy College
*/

#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

int main()
{
	double principal, intRate, T, savAmt, intPct;
		
	cout << "Please enter the principal amount of your loan: ";
	cin >> principal;
	cout << "Please enter your interest rate percentage: ";
	cin >> intPct;
	cout << "Please enter the number of times it is compounded: ";
	cin >> T;

	intRate = intPct/100 ;
	savAmt = principal * pow(1 + (intRate / T), T);
	cout << endl << endl;
	cout << "Interest rate: " << setw(15) <<intPct << "%" <<endl;
	cout << "Times compounded: " << setw(12) << T << endl;
	cout << setprecision(2) << fixed;
	cout << "Principal: " << setw(11) << "$" << setw(8) << principal << endl;
	cout << "Interest: " << setw(12) << "$"  << setw(8) << savAmt - principal << endl;
	cout << "Amount in savings: " << setw(3) << "$" << setw(8) << savAmt << endl << endl;
	return 0;

}