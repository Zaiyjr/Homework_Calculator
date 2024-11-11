name = "zaiy"
print(name)

def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y == 0:
        return "Cannot divide by zero"
    return x / y

def main():
    while True:
        # Display menu
        print("\nSelect operation:")
        print("1. Add")
        print("2. Subtract")
        print("3. Multiply")
        print("4. Divide")
        print("5. Exit")

        # Get user's choice
        choice = input("Enter choice (1/2/3/4/5): ")
        
        if choice == 'Exit':
            print("Exiting the program.")
            break

        # Get numbers from the user if a valid choice is made
        if choice in ('1', '2', '3', '4','5'):
            try:
                num1 = float(input("Enter num1: "))
                num2 = float(input("Enter num2: "))
            except ValueError:
                print("Invalid input. Please enter a number.")
                continue  # Restart the loop if input is invalid
            
            # Perform the selected operation
            if choice == '1':
                print("Result:", add(num1, num2))
            elif choice == '2':
                print("Result:", subtract(num1, num2))
            elif choice == '3':
                print("Result:", multiply(num1, num2))
            elif choice == '4':
                print("Result:", divide(num1, num2))
        else:
            print("Invalid choice. Plese enter a choice within 1-5.")

if __name__ == "__main__":
    main()
