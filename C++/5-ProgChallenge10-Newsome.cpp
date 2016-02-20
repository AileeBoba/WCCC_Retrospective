/*
5-ProgChallenge10-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main()
{
	int intYears,
		intTotalYears = 1,
		intMonths = 1;

	double dblRain, dblAvgRainMo,
		   dblTotalRain = 0;

	cout << fixed << showpoint << setprecision(1);
		
	cout << "This program will calculate" << endl
		 << "the average rainfall" << endl
		 << "per month over yearly periods." << endl << endl;
	cout << "Please enter the number of years you wish to track: ";
	cin  >> intYears;

	while (intYears <= 0)
	{
		cout << "Invalid data!" << endl
			 << "Please enter the number of years you wish to track: ";
		cin  >> intYears;
	}

	while (intTotalYears <= intYears)
	{
		cout << endl
			 << "For year " << intTotalYears << ": " << endl
			 << "Please enter the monthly total rainfall: " << endl;
		intMonths = 1;
		
		while (intMonths <= 12)
		{
			cout << "Month " << intMonths << ":";
			cin  >> dblRain;
			while (dblRain < 0)
			{
				cout << "Invalid data, please enter a positive amount of rainfall or zero." << endl;
				cin >> dblRain;
			}

			dblTotalRain = dblTotalRain + dblRain;
			intMonths++;
		}

		intTotalYears++;
	}

	dblAvgRainMo = dblTotalRain / (intYears * 12);

	cout << endl << endl
		 << "Your rainfall totals are as follows:" << endl << endl;

	cout << "Total Months:            " << intYears * 12 << endl
		 << "Total Rain:              " << dblTotalRain << endl
		 << "Average Rain per Month:  " << dblAvgRainMo << endl << endl;
}