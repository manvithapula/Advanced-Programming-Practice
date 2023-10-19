#RA2211003010001 WEEK 10 Q7
import math
def circle_area_0001(radius):
    return math.pi * radius**2
def circle_perimeter_0001(radius):
    return 2 * math.pi * radius
def rectangle_area_0001(length, width):
    return length * width
def rectangle_perimeter_0001(length, width):
    return 2 * (length + width)
def triangle_area_0001(base, height):
    return 0.5 * base * height
def triangle_perimeter_0001(side1, side2, side3):
    return side1 + side2 + side3
shape = input("Enter the shape (circle, rectangle, triangle): ")
if shape == "circle":
    radius = float(input("Enter the radius: "))
    print(f"Area: {circle_area_0001(radius)}")
    print(f"Perimeter: {circle_perimeter_0001(radius)}")
elif shape == "rectangle":
    length = float(input("Enter the length: "))
    width = float(input("Enter the width: "))
    print(f"Area: {rectangle_area_0001(length, width)}")
    print(f"Perimeter: {rectangle_perimeter_0001(length, width)}")
elif shape == "triangle":
    base = float(input("Enter the base: "))
    height = float(input("Enter the height: "))
    print(f"Area: {triangle_area_0001(base, height)}")
    side1 = float(input("Enter the first side length: "))
    side2 = float(input("Enter the second side length: "))
    side3 = float(input("Enter the third side length: "))
    print(f"Perimeter: {triangle_perimeter_0001(side1, side2, side3)}")
else:
    print("Invalid shape.")
