#include <iostream>
int add(int a1, int b1)
{
return a1 + b1;
}
int subtract(int a1, int b1)
{
return a1 - b1;
}
int multiply(int a1, int b1)
{
return a1 * b1;
}
int divide(int a1, int b1) {
if (b1 == 0) {
std::cout << "Error: Cannot divide by zero!\n";
return 0;
}
return a1 / b1;
}
int main() {
int num1, num2;
char op;
std::cout << "Enter two numbers: ";
std::cin >> num1 >> num2;
std::cout << "Enter an operator (+, -, *, /): ";
std::cin >> op;
int result;
switch (op) {
case '+':
result = add(num1, num2);
break;
case '-':
result = subtract(num1, num2);
break;
case '*':
result = multiply(num1, num2);
break;
case '/':
result = divide(num1, num2);
break;
default:
std::cout << "Invalid operator!\n";
return 1;
}
std::cout << "Result: " << result << std::endl;
return 0;
}
