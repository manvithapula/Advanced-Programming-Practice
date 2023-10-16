def largest_two_numbers0001(arr):
    max1, max2 = float('-inf'), float('-inf')

    for num in arr:
        if num > max1:
            max2 = max1
            max1 = num
        elif num > max2 and num != max1:
            max2 = num

    return max1, max2

# Example usage:
arr = [5, 10, 7, 2, 8]
largest1, largest2 = largest_two_numbers0001(arr)
print("First largest:", largest1)
print("Second largest:", largest2)
