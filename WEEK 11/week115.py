def remove_duplicates_0001(arr):
    unique_list = []
    for item in arr:
        if item not in unique_list:
            unique_list.append(item)
    return unique_list

lst = [1, 2, 2, 3, 4, 4, 5]
result = remove_duplicates_0001(lst)
print("List with duplicates removed:", result)
