#RA2211003010001 WEEK 10 Q3
def factorial0001(n):
    if n < 0:
        return "Factorial is not defined for negative numbers."
    elif n == 0 or n == 1:
        return 1
    else:
        result = 1
        for i in range(2, n + 1):
            result *= i
        return result

# Input a number from the user
num = int(input("Enter a number to calculate its factorial: "))

# Calculate the factorial
factorialresult = factorial0001(num)

# Display the result
print(f"The factorial of {num} is: {factorial0001}")
