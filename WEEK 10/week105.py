#RA2211003010001 WEEK 10 Q5
def reversestring0001(s):
    return s[::-1]

def Palindrome(s):
    return s == s[::-1]

text = input("Enter a string: ")
reversedtext = reversestring0001(text)
print(f"Reversed string: {reversedtext}")

if Palindrome(text):
    print("The entered string is a palindrome.")
else:
    print("The entered string is not a palindrome.")
