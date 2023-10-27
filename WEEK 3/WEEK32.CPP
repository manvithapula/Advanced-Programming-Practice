#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
struct Student1 {
std::string name;
int age;
int rollNumber;
};
std::vector<Student1> studentDatabase;
void addStudent(const std::string& name, int age, int rollNumber) {
Student1 newStudent;
newStudent.name = name;
newStudent.age = age;
newStudent.rollNumber = rollNumber;
studentDatabase.push_back(newStudent);
std::cout << "Student added successfully!\n";
}
void removeStudent(int rollNumber) {
auto it = std::find_if(studentDatabase.begin(), studentDatabase.end(),

[rollNumber](const Student1& s) { return s.rollNumber == rollNumber; });

if (it != studentDatabase.end()) {
studentDatabase.erase(it);
std::cout << "Student with Roll Number " << rollNumber << " removed successfully!\n";
} else {
std::cout << "Student with Roll Number " << rollNumber << " not found!\n";
}
}

void displayStudents() {
if (studentDatabase.empty()) {
std::cout << "No students in the database.\n";
} else {
std::cout << "Student Database:\n";

for (const auto& student : studentDatabase) {
std::cout << "Name: " << student.name << ", Age: " << student.age << ", Roll Number: "
<< student.rollNumber << "\n";
}
}
}
void findStudent(int rollNumber) {
auto it = std::find_if(studentDatabase.begin(), studentDatabase.end(),

[rollNumber](const Student1 &s) { return s.rollNumber == rollNumber; });

if (it != studentDatabase.end()) {
std::cout << "Student found:\n";
std::cout << "Name: " << it->name << ", Age: " << it->age << ", Roll Number: " <<
it->rollNumber << "\n";
} else {
std::cout << "Student with Roll Number " << rollNumber << " not found!\n";
}
}
int main() {
char choice;
std::string name;
int age, rollNumber;
do {
std::cout << "Menu:\n";
std::cout << "1. Add Student\n";
std::cout << "2. Remove Student\n";
std::cout << "3. Display All Students\n";
std::cout << "4. Find Student by Roll Number\n";
std::cout << "5. Exit\n";
std::cout << "Enter your choice (1/2/3/4/5): ";
std::cin >> choice;
switch (choice) {
case '1':
std::cout << "Enter Student Name: ";
std::cin.ignore(); 
std::getline(std::cin, name);
std::cout << "Enter Student Age: ";
std::cin >> age;
std::cout << "Enter Student Roll Number: ";
std::cin >> rollNumber;

addStudent(name, age, rollNumber);
break;
case '2':
std::cout << "Enter Student Roll Number to remove: ";
std::cin >> rollNumber;
removeStudent(rollNumber);
break;
case '3':
displayStudents();
break;
case '4':
std::cout << "Enter Student Roll Number to find: ";
std::cin >> rollNumber;
findStudent(rollNumber);
break;
case '5':
std::cout << "Exiting the program.\n";
break;
default:
std::cout << "Invalid choice. Please try again.\n";
break;
}
} while (choice != '5');
return 0;
}