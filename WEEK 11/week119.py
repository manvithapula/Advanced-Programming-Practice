def is_strong_password_0001(password):
    # Check password length
    if len(password) < 8:
        return False

    # Check for uppercase and lowercase letters
    has_upper = any(char.isupper() for char in password)
    has_lower = any(char.islower() for char in password)

    # Check for digits
    has_digit = any(char.isdigit() for char in password)

    # Check for special characters
    special_chars = "!@#$%^&*()_+[]{}|;:,.<>?/\\"
    has_special = any(char in special_chars for char in password)

    return has_upper and has_lower and has_digit and has_special

# Get the user's password input
password = input("Enter a password: ")

if is_strong_password_0001(password):
    print("Strong password. Good job!")
else:
    print("Weak password. Please follow the password criteria.")

