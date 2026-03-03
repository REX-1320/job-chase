//simple program
public class basics {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        DataTypes(); 
        Variables();
         Operators() ;
            ControlFlow() ;
                Arrays() ;
                

    }
//-------------baisic data types in java----------------
public static void DataTypes() {
    
        // Primitive data types
        int myInt = 10; // Integer
        double myDouble = 3.14; // Floating-point number
        char myChar = 'A'; // Character
        boolean myBoolean = true; // Boolean

        // Non-primitive data type (String)
        String myString = "Hello, Java!";

        // Output the values
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);
    
}
//------------------variables in java----------------------
public static void Variables() {

        // Variable declaration and initialization
        int age = 25; // Integer variable
        double salary = 50000.50; // Double variable
        String name = "John Doe"; // String variable

        // Output the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    
}
//------------------operators in java----------------------
public static void Operators() {
        int a = 10;
        int b = 5;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Comparison operators
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // true
        System.out.println("Less than: " + (a < b)); // false

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false
    
}
//------------------control flow statements in java----------------------
public static void ControlFlow() { 
        int number = 10;

        // If-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop
        int count = 0;
        while (count < 5) {
            System.out.println("While loop count: " + count);
            count++;
        }
    
}
//------------------arrays in java----------------------
public static void Arrays() {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Declare and initialize an array of strings
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Access and print array elements
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    
}

}