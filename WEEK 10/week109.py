#RA2211003010001 WEEK 10 Q9
def count_upper_lower_case_letters_0001(input_string):
    upper_count = sum(1 for char in input_string if char.isupper())
    lower_count = sum(1 for char in input_string if char.islower())
    return upper_count, lower_count

input_string = "Hello World"
upper_count, lower_count = count_upper_lower_case_letters_0001(input_string)
print(f"Uppercase letters: {upper_count}, Lowercase letters: {lower_count}")
