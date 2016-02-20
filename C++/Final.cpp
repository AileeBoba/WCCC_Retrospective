/*
FINAL:
1. Write a program that calculates a random number 1 through 100.
 a. The program then asks the user to guess the number.
 b. If the user guesses too high or too low then the program should output "too high" or "too low" accordingly.
 c. The program must let the user continue to guess until the user correctly guesses the number.
Display how many guesses it took the user to correctly guess the right number.

CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>
#include <cstdlib>
#include <ctime>
#include <string>
#include <Windows.h>

using namespace std;

// Global Declarations - for user information - collected inside a function, and reused within main
string	strFirstName,
		strLastName,
		strSSN;

// *** Use of data types int and bool ***
// Function Prototypes
int intRandomNum();
bool boolValidateGuess(int);
void voidWelcome();
void voidUserInfo();
void voidGotcha();
void voidThankYou();

int main()
{
	// Declarations
	int count = 0,
		intYourNumber = 0,
		intSecretNumber = 0;

	// *** Use of a function ***
	voidWelcome();

	voidUserInfo();

	voidGotcha();

	intSecretNumber = intRandomNum();

	// *** Use of cin/cout ***
	cout	<< endl
			<< " Please guess a number between 1 and 100: ";
	cin		>> intYourNumber;

	// *** Use of relational operators ***
	while (intYourNumber != intSecretNumber)
	{
		// *** Use of an if statement ***
		if (boolValidateGuess(intYourNumber))
		{
			if (intYourNumber > intSecretNumber)
			{
				cout << " Too high, please guess again: ";
				cin >> intYourNumber;
			}
			else // intYourNumber < intSecretNumber
			{
				cout << " Too low, please guess again: ";
				cin >> intYourNumber;
			}
			++count;
		}
		else
		{
			cout	<< endl
					<< " Naughty, naughty..." << endl
					<< " Invalid entry, that will cost you a guess," << endl
					<< " Please enter a number between 1 and 100: ";
			cin >> intYourNumber;
		}
	}
	
	system("CLS"); // clear screen

	cout	<< endl
			<< " Congratulations player " << strLastName << ", " << strFirstName << endl
			<< " Who's Super Secret Security Code is: " << strSSN << endl
			<< " (Told ya we wrote that down ;-) )" << endl << endl
			<< " You completed our Super Top Secret" << endl
			<< " Guessing Game in " << count << " guesses." << endl << endl
			<< " Oh!, one last thing, I almost forgot." << endl << endl
			<< " Please press enter to continue, " << endl
			<< " Please, just one more time, we promise." << endl;
	
	getchar(); 
	cin.get();
	system("CLS"); // clear screen

	voidThankYou();

	return 0;
	
} // end int main


// Functions

int intRandomNum()
{
	int intRandom;
	
	// Use the time function to seed the random number generator
	// causing it to reinitialize the rand() functions and
	// create new random numbers each time the program is run.

	// Get the system time.
	unsigned seed = time(0);

	// Seed the random number generator.
	srand(seed);

	intRandom = rand() % 100 + 1;
	return intRandom;
}

bool boolValidateGuess(int intGuess)
{
	// *** Use of logical operators ***
	if (intGuess >= 1 && intGuess <= 100)
		return true;
	else
		return false;
}

void voidWelcome()
{
	cout	<< endl << endl << endl
			<< "\t *************************************************" << endl
			<< "\t *                                               *" << endl
			<< "\t *    G R E E T I N G S                          *" << endl
			<< "\t *                                               *" << endl
			<< "\t *                                               *" << endl
			<< "\t *    Welcome to the Super Top Secret...         *" << endl
			<< "\t *                                               *" << endl
			<< "\t *                                               *" << endl
			<< "\t *     N U M B E R                               *" << endl
			<< "\t *                  G U E S S I N G              *" << endl
			<< "\t *                                   G A M E     *" << endl
			<< "\t *                                               *" << endl
			<< "\t *************************************************" << endl
			<< endl << endl
			<< " Press enter to begin... ";

	cin.get();
	system("CLS"); // clear screen
} // end voidWelcome

void voidUserInfo()
{
	char charChoice;
	
	cout	<< endl
			<< " Since this game is classified, for our own safety" << endl
			<< " we must collect some sensitive information on you" << endl
			<< " before you will be permitted to play." << endl
			<< " We appreciate your understanding on the matter." << endl << endl
			<< " Do you consent to sharing your information with us? (Y or N) ";

	cin >> charChoice;

	if (charChoice == 'Y' || charChoice == 'y')
	{
		cin.get();
		system("CLS"); // clear screen
		
		cout	<< endl
				<< " Excellent! Let's begin..." << endl << endl
				<< " Please enter the following." << endl;

		// *** Use of a for loop. ***
			for (int i = 0; i < 3; i++)
			{
				// *** Use of a switch. ***
				switch (i)
				{
				case 0:
					cout << " First Name: ";
					getline(cin, strFirstName);
					break;
				case 1:
					cout << " Last Name: ";
					getline(cin, strLastName);
					break;
				default: //case 2
					cout << " Super Secret Security Code: ";
					getline(cin, strSSN);
					break;
				} // end switch
			} // end for
		}
	else // choice is No
	{
		cout	<< endl << endl << endl << endl
				<< "\t\t Perhaps another time."
				<< endl << endl << endl << endl;

			exit(0);
	}
} // end voidUserInfo

void voidGotcha()
{
	cout << endl
		<< " Thank you, please standby..." << endl << endl
		<< " (While we write down that" << endl
		<< " Super Secret Security Code.)" << endl << endl
		<< " " << strSSN << " got it thank you!" << endl;

	Sleep(3000);
	system("CLS");
} // end voidGotcha


void voidThankYou()
{
	// *** Use of an array. ***
	// *** Use of string data type. ***
	string strGift[] = {	" Your gift is nothing...\n\n\n\t\tHA HA HA!!!",
							" The FBI is in route,\n I would get moving if I was you.",
							" This program will self destruct in...\n 3... 2... 1... KA-BOOM!",
							" You didn't hear it from me, but Plas has cookies." };
	
	int choice;
	
	cout	<< endl
			<< " We have a parting gift for you..." << endl
			<< " (We are sweet, aren't we.)" << endl << endl
			<< " Please choose a number between 1 and 4" << endl
			<< " to receive your gift immediately: ";
	
	cin >> choice;
	
	while (choice > 4 || choice < 1)
	{
		cout << " Ummm, please enter 1 2 3 or 4 only: ";
		cin >> choice;
	}

	cout << endl << endl
		 << strGift[choice - 1] << endl << endl << endl << endl;
} // end voidThankYou
	