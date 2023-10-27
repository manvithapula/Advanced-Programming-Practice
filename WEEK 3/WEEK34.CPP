#include <iostream>
#include <string>
#include <algorithm>
bool isPalindrome1(const std::string& str) {
std::string reversedStr = str;
std::reverse(reversedStr.begin(), reversedStr.end());
return str == reversedStr;
}
int main() {
std::string inputString;
std::cout << "Enter a string: ";
std::getline(std::cin, inputString);
if (isPalindrome1(inputString)) {
std::cout << "The given string is a palindrome.\n";
} else {
std::cout << "The given string is NOT a palindrome.\n";
}
return 0;
}
