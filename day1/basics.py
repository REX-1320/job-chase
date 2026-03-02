# -----------------------------
# PYTHON BASICS - DAY 1
# -----------------------------

# 1️⃣ VARIABLES
integer_var = 10
float_var = 3.14
string_var = "Munna"
boolean_var = True

print("Integer:", integer_var)
print("Float:", float_var)
print("String:", string_var)
print("Boolean:", boolean_var)


# -----------------------------
# 2️⃣ INPUT / OUTPUT
# -----------------------------
name = input("\nEnter your name: ")
print("Hello,", name)


# -----------------------------
# 3️⃣ CONDITIONS
# -----------------------------
age = int(input("\nEnter your age: "))

if age >= 18:
    print("You are an Adult.")
else:
    print("You are a Minor.")


# -----------------------------
# 4️⃣ LOOPS
# -----------------------------

print("\nFor Loop Example:")
for i in range(5):
    print("Number:", i)

print("\nWhile Loop Example:")
count = 0
while count < 5:
    print("Count:", count)
    count += 1


# -----------------------------
# 5️⃣ MINI PROBLEM
# Largest of 3 Numbers
# -----------------------------

print("\nFind Largest of 3 Numbers")

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
num3 = int(input("Enter third number: "))

if num1 >= num2 and num1 >= num3:
    largest = num1
elif num2 >= num1 and num2 >= num3:
    largest = num2
else:
    largest = num3

print("Largest number is:", largest)