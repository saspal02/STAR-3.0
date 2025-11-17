package Basics;

public class DataTypes {

    public static void main(String[] args) {

        // ---------- PRIMITIVE DATA TYPES (8 types) ----------

        // 1. byte (1 byte) – small integers
        byte age = 20;

        // 2. short (2 bytes) – slightly larger integers
        short year = 2025;

        // 3. int (4 bytes) – most common integer type
        int population = 100000;

        // 4. long (8 bytes) – large numbers; add 'L' at the end
        long distance = 9876543210L;

        // 5. float (4 bytes) – decimal numbers; add 'f'
        float price = 19.99f;

        // 6. double (8 bytes) – precise decimal numbers
        double pi = 3.1415926535;

        // 7. char (2 bytes) – stores a single character
        char grade = 'A';

        // 8. boolean (1 bit) – true or false
        boolean isJavaFun = true;



        // ---------- NON-PRIMITIVE (REFERENCE) DATA TYPES ----------

        // String – sequence of characters (not a primitive!)
        String name = "Java Programming";

        // Arrays – collection of similar type values
        int[] numbers = {10, 20, 30};

        // Class – user-defined data type
        class Dog {
            String color = "Brown";
        }
        Dog dog = new Dog();

        // Interface – contract (methods without body)
        interface Animal {
            void sound();
        }

        // Enum – constant set of values
        enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }
        Day today = Day.MON;

        // Wrapper Classes – object versions of primitive types
        Integer numObj = 100;   // int → Integer
        Double doubleObj = 99.99; // double → Double
        Boolean boolObj = false;  // boolean → Boolean


        // ---------- PRINTING OUTPUT ----------
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
        System.out.println("Price: " + price);
        System.out.println("PI: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);

        System.out.println("Name: " + name);
        System.out.println("First array number: " + numbers[0]);
        System.out.println("Dog Color: " + dog.color);
        System.out.println("Today's Day: " + today);
        System.out.println("Integer Object: " + numObj);
        System.out.println("Boolean Object: " + boolObj);
    }
}

