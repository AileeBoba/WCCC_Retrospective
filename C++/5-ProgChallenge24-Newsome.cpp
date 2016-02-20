/*
5-ProgChallenge24-Newsome
Gary A. Newsome
180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <iomanip>
#include <fstream>

using namespace std;

int main()

{
	int intNumFile = 0,
		intNumNum = 0;
	
    double dblNumTotal = 0,
           dblNumAvg = 0.0;

	cout << fixed << showpoint << setprecision(2);

	// Open the file
	ifstream inputFile;
	inputFile.open("Random.txt");

	cout << "Good evening, opening file 'Random.txt', calculating...\n"
		 << endl << endl;

	while (inputFile >> intNumFile)
	{
		intNumNum++;
		dblNumTotal += intNumFile;
		dblNumAvg = dblNumTotal / intNumNum;
	}

	cout << "There are a total of " << intNumNum << " numbers in the file." << endl << endl
		 << "Totaling " << dblNumTotal << endl << endl
		 << "The average of these " << intNumNum << " numbers is: " << dblNumAvg << endl << endl;

	// Close the file
	inputFile.close();

	return 0;

}