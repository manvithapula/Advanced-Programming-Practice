#include <iostream>
#include <cmath>
using namespace std;
const double PI = 3.14159265359;
double calculateCircleArea1(double radius) {
return PI * pow(radius, 2);
}
double calculateCirclePerimeter1(double radius) {
return 2 * PI * radius;
}
double calculateRectangleArea1(double length, double width) {
return length * width;
}
double calculateRectanglePerimeter1(double length, double width) {
return 2 * (length + width);
}
double calculateTriangleArea1(double base, double height) {
return 0.5 * base * height;
}
double calculateTrianglePerimeter1(double side1, double side2, double side3) {
return side1 + side2 + side3;
}
int main() {
int choice;
double radius, length, width, base, height, side1, side2, side3;
cout << "Select a shape to calculate its area and perimeter:" << endl;
cout << "1. Circle" << endl;
cout << "2. Rectangle" << endl;
cout << "3. Triangle" << endl;
cin >> choice;
switch (choice) {
case 1:
cout << "Enter the radius of the circle: ";
cin >> radius;
cout << "Area of the circle: " << calculateCircleArea1(radius) << endl;
cout << "Perimeter of the circle: " << calculateCirclePerimeter1(radius) << endl;

break;
case 2:
cout << "Enter the length and width of the rectangle: ";
cin >> length >> width;
cout << "Area of the rectangle: " << calculateRectangleArea1(length, width) << endl;
cout << "Perimeter of the rectangle: " << calculateRectanglePerimeter1(length, width) <<
endl;
break;
case 3:
cout << "Enter the base and height of the triangle: ";
cin >> base >> height;
cout << "Area of the triangle: " << calculateTriangleArea1(base, height) << endl;
cout << "Perimeter of the triangle: Enter the lengths of the three sides: ";
cin >> side1 >> side2 >> side3;
cout << "Perimeter of the triangle: " << calculateTrianglePerimeter1(side1, side2, side3)
<< endl;
break;
default:
cout << "Invalid choice." << endl;
}
return 0;
}
