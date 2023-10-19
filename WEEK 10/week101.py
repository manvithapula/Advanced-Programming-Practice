#RA2211003010001 WEEK 10 Q1
def sumtwonumbers0001(a, b):
    # Calculate the sum of two numbers
    total = a + b
    if 120 <= total <= 320:
        return 200
    return total

def sumthreenumbers0001(a, b, c):
    # Calculate the sum of three numbers
    total = a + b + c
    if 120 <= total <= 320:
        return 200
    return total

# Input two or three numbers from the user
choice = int(input("Enter 1 for sum of two numbers, or 2 for sum of three numbers: "))

if choice == 1:
    num1 = float(input("Enter the first number: "))
    num2 = float(input("Enter the second number: "))
    result = sumtwonumbers0001(num1, num2)
    print(f"The result is: {result}")
elif choice == 2:
    num1 = float(input("Enter the first number: "))
    num2 = float(input("Enter the second number: "))
    num3 = float(input("Enter the third number: "))
    result = sumthreenumbers0001(num1, num2, num3)
    print(f"The result is: {result}")
else:
    print("Invalid choice. Please enter 2 or 3 for the number of values to sum.")
