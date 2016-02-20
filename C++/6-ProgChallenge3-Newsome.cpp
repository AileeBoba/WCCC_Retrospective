/*
6-ProgChallenge3-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

// Function Prototypes
double getSales(string); // receives the division name, asks for and validates the divisions sales.
void findHighest(double, double, double, double); // receives 4 division's sales numbers, and outputs the highest division's name and sales numbers.

int main()
{

	// Declarations
	double dblNESales, dblSESales, dblNWSales, dblSWSales;

	string strYN = "begin";

	char charContinue = 'N';

	cout << fixed << showpoint << setprecision(2);

	cout << "Welcome, this program will determine which division had the highest\n"
		 << "sales totals for any given quarter.\n" << endl
		 << "Would you like to " << strYN << " ? (Y or N): ";
	cin  >> charContinue;
	cout << endl;

	while (charContinue == 'Y' || charContinue == 'y')
	{
		strYN = "continue";

		for (int d = 0; d < 4; d++)
		{
			switch (d)
			{
			case 0:
				dblNESales = getSales("Northeast");
				break;
			case 1:
				dblSESales = getSales("Southeast");
				break;
			case 2:
				dblNWSales = getSales("Northwest");
				break;
			default:
				dblSWSales = getSales("Southwest");
				break;
			} // end switch
		} // end for

		findHighest(dblNESales, dblSESales, dblNWSales, dblSWSales);

		cout << endl << endl
			 << "Would you like to " << strYN << " with another quarter ? (Y or N): ";
		cin  >> charContinue;
		cout << endl;

	} // end while

	cout << endl << endl 
		 << "Thank you, for choosing our program." 
		 << endl << endl << endl;

	return 0;
} // end main

double getSales(string strDiv)
{
	// receives the division name, asks for and validates the divisions sales.
	double dblDivSales = 0;

	cout << "Please enter the sales for the " << strDiv << " division: ";
	cin >> dblDivSales;
	cout << endl;

	while (dblDivSales < 0)
	{
		cout << "Sales can't be less than 0.00, \nplease enter a value of 0.00 or greater. ";
		cin >> dblDivSales;
	}

	return dblDivSales;
} // getSales


void findHighest(double dblNESales, double dblSESales, double dblNWSales, double dblSWSales)
{
	// receives 4 division's sales numbers, and outputs the highest division's name and sales numbers.
	string strDiv;

	if (dblNESales > dblSESales && dblNESales > dblNWSales && dblNESales > dblSWSales)
	{
		strDiv = "Northeast";
		cout << endl
			<< "The " << strDiv << " division has the highest total sales for this quarter, \n"
			<< "with a total of $" << dblNESales << ".";
		return;
	}
	else if (dblSESales > dblNESales && dblSESales > dblNWSales && dblSESales > dblSWSales)
	{
		strDiv = "Southeast";
		cout << endl
			 << "The " << strDiv << " division has the highest total sales for this quarter, \n"
			 << "with a total of $" << dblSESales << ".";
		return;
	}
	else if (dblNWSales > dblNESales && dblNWSales > dblSESales && dblNWSales > dblSWSales)
	{
		strDiv = "Northwest";
		cout << endl
			 << "The " << strDiv << " division has the highest total sales for this quarter, \n"
			 << "with a total of $" << dblNWSales << ".";
		return;
	}
	else if (dblSWSales > dblNESales && dblSWSales > dblSESales && dblSWSales > dblNWSales)
	{
		strDiv = "Southwest";
		cout << endl
			 << "The " << strDiv << " division has the highest total sales for this quarter, \n"
			 << "with a total of $" << dblSWSales << ".";
		return;
	}
	else // a tie occurs
	{
		cout << "It appears we have a tie amongst at least two divisions,\n"
			 << "no winner can be determined at this time.";
		return;
	}

	
} // end findHighest