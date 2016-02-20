/*
5-ProgChallenge1-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>

using namespace std;

int main()
{
	int intNumber,
		intX = 1,
		intTotal = 0;

	// get information from the user
	cout	<< "This program will calculate the sum of all integers \n"
			<< "from 1 up to a number you choose. \n"
			<< "Please choose a whole number: ";
	
	cin >> intNumber;
	cout << endl << endl;

	// validate data
	while (intNumber <= 0)
	{
		cout	<< "\tThe number entered is invalid, \n"
				<< "\tplease enter a positive number 1 or greater: ";
		
		cin >> intNumber;
		cout << endl << endl;
	}

	// calculate
		while (intX <= intNumber)
	{
		intTotal = intTotal + intX;
		intX++;
	}

	// display
	cout << "\tThe sum of every integer from 1 up through " << intNumber << " is " << intTotal << endl << endl;
	return 0;

}