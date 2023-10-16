def generate_fibonacci_sequence_0001(n):
    if n <= 0:
        return []

    fibonacci_sequence = [0, 1]
    while len(fibonacci_sequence) < n:
        next_term = fibonacci_sequence[-1] + fibonacci_sequence[-2]
        fibonacci_sequence.append(next_term)

    return fibonacci_sequence

n = int(input("Enter the number of Fibonacci terms to generate: "))

if n <= 0:
    print("Please enter a positive number.")
else:
    fibonacci_sequence = generate_fibonacci_sequence_0001(n)
    print("Fibonacci sequence:", fibonacci_sequence)
