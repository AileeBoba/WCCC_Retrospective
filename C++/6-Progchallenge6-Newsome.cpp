/*
6-ProgChallenge6-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

using namespace std;

// Function Prototype
double kineticEnergy(double, double); // calculates kinetic energy

int main()
{
	// declarations
	double dblMass, dblVelocity, dblKE = 0, dblKEStandard = 0;
	string strObject;

	// set output
	cout << showpoint << setprecision(4); // fixed excluded, scientific notation is possible
	
	// greeting
	cout << "\n\t\tKinetic Energy Calculator.\n\n"
		<< "Greetings, welcome to the " << char(34) << "Kinettic Energy Calculator" << char(34) << ",\n"
		<< "this program will accept an object's mass and velocity,\n"
		<< "and then return to you, the object's kinetic energy.\n\n";
	
	// collect data
	cout << "Please enter the objects name: ";
	getline(cin, strObject);

	cout << endl; 

	cout << "Please enter the mass of the " << strObject << " in kilograms: ";
	cin >> dblMass;

	while (dblMass < 0)
	{
		cout << "The mass of the object cannot be less than 0\nPlease enter the mass of the " << strObject << ": ";
		cin >> dblMass;
	} // end while - dblMass validate

	cout << endl;

	cout << "Now, please enter the velocity at which the\n" << strObject << " is traveling, in meters per second: ";
	cin  >> dblVelocity;

	while (dblVelocity < 0)
	{
		cout << "The velocity of the object cannot be less than 0\nPlease enter the velocity of the " << strObject << ": ";
		cin >> dblVelocity;
	} // end while - dblVelocity validate

	cout << endl;

	// call function
	dblKE = kineticEnergy(dblMass, dblVelocity);
	
	// output
	cout << "The " << strObject << " has a kinetic energy of: " << endl
		 << dblKE << " in scientific notation." << endl << endl;
			
	dblKEStandard = dblKE;

	cout << "Or " << fixed << showpoint << setprecision(2) // convert scientific notation to standard
		 << dblKEStandard
		 << " in standard notation." << endl << endl
		 << "Thank you for using the Kinetic Energy Calculator" << endl << endl;

} // end main

double kineticEnergy(double mass, double velocity)
{
	// calculates kinetic energy
	double KE = 0;

	KE = (.5 * (mass * pow(velocity, 2)));
	return KE;

} // end kineticEnergy





