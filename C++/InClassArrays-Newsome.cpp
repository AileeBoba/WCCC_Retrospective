/*
Write a program that lets a user enter values (integers) into an array.
Provide directions for the user at the beginning (nothing fancy required).
The program should then display the values the user entered into the array followed by displaying
largest and smallest values in the array.
The screen output will be displayed in three sections with clear screens between each one.
Attached is document with an example of how the screen output should look.
*/

/*
InClassArrays-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
	const int ARRAY_SIZE = 10;
	int numbers[ARRAY_SIZE];
	
	cout	<< endl
			<< " This program will accept 10 numbers of your choice into an array." << endl
			<< " It will display the numbers back to you, and then tell you which" << endl
			<< " is the largest and which is the smallest." << endl << endl
			<< " Let's begin..." << endl << endl
			<< " Press enter to begin: ";

	// clear screen
	cin.get();
	system("CLS");

	// load tha array
	for (int count = 0; count < ARRAY_SIZE; count++)
	{
		cout << " Enter value #" << count + 1 << ": ";
		cin   >> numbers[count];
		cout  << endl;
	}

	// initialize high and low markers
	int intHigh = numbers[0];
	int	intLow = numbers[0];

	// find the high and low values
	for (int count = 0; count < ARRAY_SIZE; count++)
	{
		if (numbers[count] > intHigh)
			intHigh = numbers[count];

		if (numbers[count] < intLow)
			intLow = numbers[count];
	}
	
	// clear screen
	cin.get();
	system("CLS");

	// display values
	cout << " You entered the following values..." << endl << endl;

	for (int count = 0; count < ARRAY_SIZE; count++)
	{
		cout << " Value #" << count + 1 << ": " << numbers[count] << endl << endl;
	}

	// clear screen
	cout << " Press enter to proceed: ";
	cin.get();
	system("CLS");

	// display high and low values
	cout	<< " The largest value is " << intHigh << "." << endl << endl
			<< " The smallest value is " << intLow << "." << endl << endl << endl;

}