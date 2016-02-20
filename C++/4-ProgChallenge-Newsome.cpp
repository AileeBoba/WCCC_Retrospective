/*
4-ProgChallenge4-Newsome
Gary A. Newsome
CPT 180_27 C++ Programming
Westmoreland County Community College
*/

#include <iostream>

using namespace std;

int main()
{
	int l1, w1, l2, w2, rect1, rect2;

	cout << '\n' << '\t' << "This program will accept the length and width" << endl
		<< '\t' << "of two rectangles, and compare their areas." << endl
		<< '\t' << "Please enter the length and width of the first rectangle,\n\tseperated by a space: ";

	cin >> l1 >> w1;

	cout << '\n' << '\t' << "Thank you,\n\tPlease enter the length and width of the second rectangle\n\tseperated by a space: ";
	cin >> l2 >> w2;

	rect1 = l1 * w1;
	rect2 = l2 * w2;

	cout << '\n' << '\n';

	if (rect1 > rect2)
	{
		cout << '\t' <<"Rectangle 1 has the greater area." << endl;
	}
	else if (rect1 < rect2)
	{
		cout << '\t' << "Rectangle 2 has the greater area." << endl;
	}
	else
	{
		cout << '\t' << "These two rectangles has identical areas." << endl;
	}

	cout << '\n' << '\n' << '\t';

	return 0;
}