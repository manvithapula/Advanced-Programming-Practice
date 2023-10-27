#include <iostream>
int main() {
int size;
std::cout << "Enter the size of the array: ";
std::cin >> size;
int* arr = new int[size];
std::cout << "Enter " << size << " elements: ";
for (int i = 0; i < size; i++) {
std::cin >> arr[i];
}
int sum = 0;
for (int i = 0; i < size; i++) {
sum += arr[i];
}
std::cout << "Sum of all elements: " << sum << std::endl;
delete[] arr;
return 0;
}
