def sum_even_and_odd_0001(arr):
    even_sum = sum(num for num in arr if num % 2 == 0)
    odd_sum = sum(num for num in arr if num % 2 != 0)
    return even_sum, odd_sum

arr = [1, 2, 3, 4, 5]
even_sum, odd_sum = sum_even_and_odd_0001(arr)
print("Sum of even numbers:", even_sum)
print("Sum of odd numbers:", odd_sum)
