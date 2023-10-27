#include <iostream>
class Stack1 {
private:
int *arr;
int top;
int capacity;
public:
Stack1(int size) {
capacity = size;
arr = new int[capacity];
top = -1;
}
~Stack1() {
delete[] arr;
}
bool isFull() {
return top == capacity - 1;
}
bool isEmpty() {
return top == -1;
}
void push(int element) {
if (isFull()) {
std::cout << "Stack overflow, cannot push element " << element << std::endl;
} else {
arr[++top] = element;
std::cout << "Pushed " << element << " into the stack." << std::endl;
}
}
int pop() {
if (isEmpty()) {
std::cout << "Stack underflow, cannot pop element from an empty stack." << std::endl;
return -1; // You can choose to handle the underflow situation differently if needed.
} else {

return arr[top--];
}
}
};
int main() {
int size;
std::cout << "Enter the size of the stack: ";
std::cin >> size;
Stack1 stack(size);
stack.push(10);
stack.push(20);
stack.push(30);
std::cout << "Popped element: " << stack.pop() << std::endl;
std::cout << "Popped element: " << stack.pop() << std::endl;
stack.push(40);
return 0;
}