#RA2211003010001 WEEK 10 Q8
def celsius_to_fahrenheit_0001(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

def fahrenheit_to_celsius_0001(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

celsius_temperature = 30
fahrenheit_temperature = celsius_to_fahrenheit_0001(celsius_temperature)
print(f"{celsius_temperature}°C is equal to {fahrenheit_temperature}°F")

fahrenheit_temperature = 86
celsius_temperature = fahrenheit_to_celsius_0001(fahrenheit_temperature)
print(f"{fahrenheit_temperature}°F is equal to {celsius_temperature}°C")
