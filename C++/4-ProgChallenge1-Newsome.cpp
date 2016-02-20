/*
4-ProgChallenge1-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>

using namespace std;


int main()
{
	int num1, num2;

	cout << "Welcome, this program will accept two numbers and tell you which is greater." << endl;
	cout << "Let's begin...\nPlease enter two whole numbers separated by a space.";
	cin >> num1 >> num2; 
	
	
	if (num1 > num2)
	{
		cout << '\n' << '\t' << num1 << " is greater than " << num2 << '\n' << '\n';
	}

	else if (num1 < num2)
	{
		cout << '\n' << '\t' << num1 << " is less than " << num2 << '\n' << '\n';
	}

	else
	{
		cout << '\n' << '\t' << "These two numbers are identical." << '\n' << '\n';
	}

		return 0;
}