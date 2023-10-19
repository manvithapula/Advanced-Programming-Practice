#RA2211003010001 WEEK 10 Q4
def even0001(number):
    return number % 2 == 0

def prime0001(number):
    if number <= 1:
        return False
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            return False
    return True

num = int(input("Enter a number: "))
if even0001(num):
    print(f"{num} is even.")
else:
    print(f"{num} is odd.")

if prime0001(num):
    print(f"{num} is prime.")
else:
    print(f"{num} is not prime.")
