#RA2211003010001 WEEK 10 Q6
def fibonacci0001(n):
    fib_sequence = [0, 1]
    while len(fib_sequence) < n:
        next_number = fib_sequence[-1] + fib_sequence[-2]
        fib_sequence.append(next_number)
    return fib_sequence

n = int(input("Enter the number of Fibonacci sequence terms to generate: "))
fib_sequence = fibonacci0001(n)
print(f"Fibonacci Sequence: {fib_sequence}")
