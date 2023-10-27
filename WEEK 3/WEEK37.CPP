#include <iostream>
#include <fstream>
#include <vector>
int main() {
std::string filename;
std::cout << "Enter the name of the text file: ";
std::cin >> filename;
std::ifstream file(filename);
if (!file.is_open()) {
std::cout << "Error: Unable to open the file." << std::endl;
return 1;
}
std::vector<std::string> lines;
std::string line;
while (std::getline(file, line)) {
lines.push_back(line);
}
file.close();
std::cout << "Content of the file '" << filename << "':" << std::endl;
for (int i = 0; i < lines.size(); i++) {
std::cout << i + 1 << ": " << lines[i] << std::endl;
}
return 0; 
}