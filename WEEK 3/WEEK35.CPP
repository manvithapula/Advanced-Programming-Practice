#include <iostream>
void swap1(int &a, int &b) {
int temp = a;
a = b;
b = temp;
}
void reverseArray1(int arr[], int size) {
int start = 0;
int end = size - 1;
while (start < end) {
swap1(arr[start], arr[end]);
start++;
end--;
}
}
void printArray(int arr[], int size) {
for (int i = 0; i < size; i++) {
std::cout << arr[i] << " ";
}
std::cout << std::endl;
}
int main() {
int arr[] = {1, 2, 3, 4, 5};
int size = sizeof(arr) / sizeof(arr[0]);
std::cout << "Original array: ";
printArray(arr, size);
reverseArray1(arr, size);
std::cout << "Reversed array: ";
printArray(arr, size);
return 0;
}
