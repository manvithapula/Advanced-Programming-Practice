#include <iostream>
#include <string>
#include <vector>
class Customer {
private:
std::string name;
std::string address;
public:
Customer(std::string name, std::string address) : name(name), address(address) {}
std::string getName() const {
return name;
}
std::string getAddress() const {
return address;
}
};
class Account {
private:
int accountNumber;
double balance;
Customer* customer;
public:
Account(int accountNumber, double balance, Customer* customer) :
accountNumber(accountNumber), balance(balance), customer(customer) {}
int getAccountNumber() const {
return accountNumber;
}
double getBalance() const {
return balance;
}
Customer* getCustomer() const {
return customer;

}
void deposit(double amount) {
balance += amount;
}
bool withdraw(double amount) {
if (amount > balance)
return false;
balance -= amount;
return true;
}
};
int main() {
std::vector<Customer*> customers;
std::vector<Account*> accounts;
while (true) {
std::cout << "1. Add Customer\n2. Open Account\n3. Deposit\n4. Withdraw\n5. Exit\n";
int choice;
std::cin >> choice;
switch (choice) {
case 1: {
std::string name, address;
std::cout << "Enter customer name: ";
std::cin.ignore();
std::getline(std::cin, name);
std::cout << "Enter customer address: ";
std::getline(std::cin, address);
Customer* newCustomer = new Customer(name, address);
customers.push_back(newCustomer);
std::cout << "Customer added successfully!\n";
break;
}
case 2: {
if (customers.empty()) {
std::cout << "No customers available. Please add a customer first.\n";
break;
}

int accNumber;
double initialBalance;
int customerIndex;
std::cout << "Enter account number: ";
std::cin >> accNumber;
std::cout << "Enter initial balance: ";
std::cin >> initialBalance;
std::cout << "Enter the index of the customer for this account (0 to " <<
customers.size() - 1 << "): ";
std::cin >> customerIndex;
if (customerIndex < 0 || customerIndex >= customers.size()) {
std::cout << "Invalid customer index.\n";
break;
}
Account* newAccount = new Account(accNumber, initialBalance,
customers[customerIndex]);
accounts.push_back(newAccount);
std::cout << "Account opened successfully!\n";
break;
}
case 3: {
if (accounts.empty()) {
std::cout << "No accounts available. Please open an account first.\n";
break;
}
int accountNumber;
double amount;
std::cout << "Enter account number: ";
std::cin >> accountNumber;
std::cout << "Enter the amount to deposit: ";
std::cin >> amount;
for (Account* account : accounts) {
if (account->getAccountNumber() == accountNumber) {
account->deposit(amount);
std::cout << "Amount deposited successfully!\n";
break;
}
}

std::cout << "Account number not found.\n";
break;
}
case 4: {
if (accounts.empty()) {
std::cout << "No accounts available. Please open an account first.\n";
break;
}
int accountNumber;
double amount;
std::cout << "Enter account number: ";
std::cin >> accountNumber;
std::cout << "Enter the amount to withdraw: ";
std::cin >> amount;
for (Account* account : accounts) {
if (account->getAccountNumber() == accountNumber) {
if (account->withdraw(amount))
std::cout << "Amount withdrawn successfully!\n";
else
std::cout << "Insufficient balance. Cannot withdraw.\n";
break;
}
}
std::cout << "Account number not found.\n";
break;
}
case 5:
std::cout << "Exiting the program.\n";
// Freeing memory
for (Account* account : accounts) {
delete account;
}
for (Customer* customer : customers) {
delete customer;
}
return 0;
default:
std::cout << "Invalid choice. Please try again.\n";
}
}
}