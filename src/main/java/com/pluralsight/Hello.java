package com.pluralsight;

public class Hello {
    public static void main(String[] args) {
        sayHello();
        sayGoodBye();
        sayGoodMorning();
    }
    static void sayHello(){
        System.out.println("Hello, World!");
    }

    static void sayGoodBye(){
        System.out.println("Goodbye!");
    }

    static void sayGoodMorning(){
        System.out.println("Good morning!");
    }


}


//Create a new package com.pluralsight and a new file named Hello.java
//2. Create these methods:
//        a. main()
//b. sayHello() that prints "Hello, World!"
//        c. sayGoodbye() that prints "Goodbye!"
//        d. sayGoodMorning() that prints "Good morning!"
//e. Call each method from main()





//3. Create a new file named Menu.java
//a. Create main() method
//b. Create a method called displayMenu() that prints:
//        "=== MENU ==="
//        "1. Coffee - $3.99"
//        "2. Tea - $2.99"
//        "3. Cookie - $1.99"
//c. Call it twice from main() to see it's reusable
//        118
//        4. Create a new file named Format.java
//a. Create a main() method
//a. Create this method: formatName(String first,
//                                  String last)
//b. It should RETURN "Last, First" format
//b. Example: formatName("Bob", "Smith") returns "Smith, Bob"
//c. Call it in your main and put it in the () of a System.out.println(). Bonus:
//set the return of the method call in a variable and print that!
//        5. Create a new file named CompareNumbers.java
//a. Create a main() method
//b. Create this method: isEven(int number)
//a. returns true if even
//c. Create: isPositive(double number)
//d. returns true if > 0
//e. Call these within a sout to view if your methods work or not. EX.
//        System.out.println(isEven(5)); should display false