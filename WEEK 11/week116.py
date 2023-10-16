def matrix_input_0001():
    try:
        rows = int(input("Enter the number of rows: "))
        cols = int(input("Enter the number of columns: "))
        matrix = []
        print("Enter the elements row-wise:")
        for i in range(rows):
            row = []
            for j in range(cols):
                element = float(input(f"Enter element at position ({i+1},{j+1}): "))
                row.append(element)
            matrix.append(row)
        return matrix
    except ValueError:
        print("Invalid input. Please enter valid numeric values.")
        return matrix_input_0001()

def matrix_multiply(matrix1, matrix2):
    rows1 = len(matrix1)
    cols1 = len(matrix1[0])
    rows2 = len(matrix2)
    cols2 = len(matrix2[0])

    if cols1 != rows2:
        print("Matrix multiplication not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.")
        return None

    result = [[0 for _ in range(cols2)] for _ in range(rows1)]

    for i in range(rows1):
        for j in range(cols2):
            for k in range(cols1):
                result[i][j] += matrix1[i][k] * matrix2[k][j]

    return result

def print_matrix(matrix):
    for row in matrix:
        print(row)

print("Enter the first matrix-")
matrix1 = matrix_input_0001()

print("Enter the second matrix-")
matrix2 = matrix_input_0001()

result = matrix_multiply(matrix1, matrix2)

if result:
    print("Result of matrix multiplication:")
    print_matrix(result)
