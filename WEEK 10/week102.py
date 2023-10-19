#RA2211003010001 WEEK 10 Q2
def maximum0001(num1, num2, num3):
    # Use the built-in max function to find the maximum of the three numbers
    maximum = max(num1, num2, num3)
    return maximum

# Input three numbers from the user
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))

# Call the function to find the maximum
maximum = maximum0001(num1, num2, num3)

# Display the result
print(f"The maximum number is: {maximum}")
