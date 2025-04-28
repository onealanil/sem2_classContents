# Resources for Semester 2 Students

You can find resources (research links, blogs, documentation), weekly content!

---

This repository is created for **Semester 2 students** to help with revision, learning, and improving their understanding of the subjects.

Make sure to **utilize the available resources** effectively and make the most of this learning opportunity.  
You'll find **valuable research links, blogs, documentation, and weekly content** to guide you through your coursework.

---

################################## Resources for String ####################################

## What is a String?
- Strings are a sequence of characters.
- Strings are treated as objects.
- String is a class.
- Strings are immutable.
- We can have mutable Strings using `StringBuffer` or `StringBuilder`.

---

## **StringBuffer**
- `StringBuffer` is a peer class of `String`, it is **mutable** in nature and **thread-safe**.

---

## **StringBuilder**
- `StringBuilder` in Java is an alternative to `String` and `StringBuffer`.
- It creates a **mutable** sequence of characters.
- It is **not thread-safe**.

---

## **Resources**

1. **String constructor considered useless turns out to be useful after all**  
   [Read more](https://kjetilod.blogspot.com/2008/09/string-constructor-considered-useless.html)

2. **Geeks for Geeks - Strings in Java**  
   [Read more](https://www.geeksforgeeks.org/strings-in-java/)

3. **Setup Java in VS Code**  
   [Watch Video](https://www.youtube.com/watch?v=JPdUiJzIw_M)

---
---
======================================== ArrayList ========================================

### Difference Between Array and ArrayList

1. **Array**
   - Fixed size (defined at creation)
   - Faster performance (less overhead)
   - Can store primitive types and objects
   - Cannot be resized, needs manual copying for changes
   - No built-in methods for adding/removing elements
   - More memory-efficient

2. **ArrayList**
   - Dynamic size (can grow/shrink)
   - Slightly slower due to dynamic resizing
   - Only stores objects (wrapper classes for primitives)
   - Automatically resizes when adding/removing elements
   - Provides methods like `.add()`, `.remove()`, `.size()`
   - Uses more memory due to internal resizing and extra features

---

## **Understanding ArrayList in Java**

`ArrayList` is a part of the `java.util` package and provides a **resizable array** implementation of the `List` interface.

### **How to Use an ArrayList?**

#### **1. Import the ArrayList Class**
```java
import java.util.ArrayList;
```

#### **2. Create an ArrayList**
```java
ArrayList<String> names = new ArrayList<>();
```

#### **3. Add Elements to the List**
```java
names.add("Ram");
names.add("Sita");
names.add("Gopal");
```

#### **4. Access Elements**
```java
System.out.println(names.get(1)); // Output: Sita
```

#### **5. Update Elements**
```java
names.set(1, "Radha"); // Replaces "Sita" with "Radha"
```

#### **6. Remove an Element**
```java
names.remove(0); // Removes "Ram"
```

#### **7. Find the Size of the List**
```java
System.out.println(names.size()); // Output: 2
```

#### **8. Loop Through the ArrayList**
```java
for (String name : names) {
    System.out.println(name);
}
```

---

## **When to Use ArrayList?**
- When you **don’t know the exact number** of elements in advance.
- When you need **easy addition and removal** of elements.
- When you need **built-in methods** to manipulate data.

## **When to Use an Array Instead?**
- When you need **better performance** and memory efficiency.
- When the number of elements is **fixed** and known in advance.

_ArrayLists are useful in scenarios where data changes dynamically, such as managing a list of students, tasks, or database records._
---

---
=================================== Swing ====================================

Awt vs Swing 

1. Awt
- Not Lightweight (Heavy)
- OS Dependent
- lower
- Fewer Component

2. Swing
- Lightweight
- Customizable
- Faster
- Rich Component

--------------------------Swing Components ----------------------------------------
- JFrame - Main Window
- JPanel - A container for Component
- JDialog - Popup Window
- JScrollPane - Scrollable panel
  
------------------------ Common Swing component --------------------------------
Component	Description
- JLabel	- Displays text/images
- JButton	- Clickable button
- JTextField - Single-line text input
- JTextArea - Multi-line text input
- JCheckBox  - Checkbox selection
- JRadioButton - Radio button selection
- JComboBox - Dropdown list
- JList - List of items

----------------- Action Listener ------------------------------------------
- Event --> An action that occurs (click, keypress, etc.).
- Event Source --> The component that generates the event (e.g., JButton).
- Event Listener --> The interface that listens for events (e.g., ActionListener).
- Event Handler --> The method that executes when an event occurs.


---


# Java Concepts: Casting and File Handling

## ➡️ Casting in Java

### What is Casting?
Type casting refers to converting a variable from one data type to another. It's essential for operations between different data types.

### Types of Casting:
1. **Implicit Casting (Widening Conversion)**:
   - Automatic conversion from smaller to larger type
   - No data loss
   - Order: `byte -> short -> int -> long -> float -> double`

2. **Explicit Casting (Narrowing Conversion)**:
   - Manual conversion from larger to smaller type
   - Potential data loss
   - Order: `double -> float -> long -> int -> short -> byte`

3. **Object/Reference Casting**:
   - Converting between reference types in inheritance hierarchies
   - Upcasting: Converting a subclass to a superclass (implicit)
   - Downcasting: Converting a superclass to a subclass (explicit)

### Examples:

#### Implicit Casting Example:
```java
public class ImplicitExample {
    public static void main(String[] args) {
        byte b = 100;
        int i = b;  // Automatic casting
        System.out.println(i);  // Output: 100
    }
}
```

#### Explicit Casting Example:
```java
public class ExplicitExample {
    public static void main(String[] args) {
        double d = 100.99;
        int i = (int) d;  // Manual casting
        System.out.println(i);  // Output: 100
    }
}
```

#### Combined Example:
```java
public class CastingExample {
    public static void main(String[] args) {
        byte b = 100;
        int i = b;          // Implicit
        byte c = (byte)(i + 200);  // Explicit
        System.out.println(c);  // Output: -56 (overflow)
    }
}
```

### Object Casting and instanceof Operator
   The instanceof operator checks if an object is an instance of a specific class or interface.

### Class Hierarchy Example:
```java
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastingExample {
    public static void main(String[] args) {
        // Upcasting (implicit)
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        // instanceof checks
        System.out.println(animal1 instanceof Dog);    // true
        System.out.println(animal1 instanceof Cat);    // false
        System.out.println(animal1 instanceof Animal); // true
        
        // Safe downcasting with instanceof
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;  // Downcasting (explicit)
            System.out.println("Downcast successful");
        }
        
        // Unsafe downcasting (will throw ClassCastException)
        try {
            Dog dog = (Dog) animal2;  // animal2 is actually a Cat
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}
```
Pattern Matching with instanceof (Java 16+):
```java
public class PatternMatchingExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        
        // Old way
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            // Use dog
        }
        
        // New way with pattern matching
        if (animal instanceof Dog dog) {
            // Use dog directly
        }
    }
}
```

### Casting Best Practices:
- Use implicit casting when possible
- Be cautious with explicit casting (may lose precision)
- Check for potential overflow
- Avoid casting between incompatible types

## ➡️ File Handling in Java

### Overview
Java provides robust file handling through java.io and java.nio packages. Key operations include:

- Creating files/directories
- Reading/writing data
- Checking file properties
- Managing file streams

### Core Classes:

| Class | Purpose |
|-------|---------|
| File | File/directory operations |
| FileWriter | Write characters to file |
| FileReader | Read characters from file |
| BufferedReader | Efficient text reading |
| Scanner | Parsing file content |
| FileInputStream/FileOutputStream | Byte-level operations |

### Complete File Handling Example:
```java
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) {
        // Data to write
        ArrayList<String> data = new ArrayList<>();
        data.add("John Doe");
        data.add("Jane Smith");
        data.add("Bob Johnson");
        
        // File path
        String dirPath = "./data";
        String filePath = dirPath + "/employees.txt";
        
        try {
            // 1. Create directory if needed
            File directory = new File(dirPath);
            if (!directory.exists()) {
                if (directory.mkdir()) {
                    System.out.println("Directory created");
                }
            }
            
            // 2. Create file
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }
            
            // 3. Write data
            FileWriter writer = new FileWriter(file);
            for (String line : data) {
                writer.write(line + "\n");
            }
            writer.close();
            System.out.println("Data written successfully");
            
            // 4. Read data
            System.out.println("\nFile contents:");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
            
            // 5. File info
            System.out.println("\nFile information:");
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
```

### Key Methods:

| Operation | Methods |
|-----------|---------|
| Create | createNewFile(), mkdir() |
| Write | write(), append() |
| Read | read(), nextLine() |
| Info | exists(), length(), lastModified() |
| Delete | delete() |

### Best Practices:
- Always close resources (use try-with-resources)
- Handle IOExceptions properly
- Check file existence before operations
- Use buffering for large files
- Specify proper character encoding

### Try-With-Resources Example:
```java
try (FileWriter writer = new FileWriter("output.txt");
     BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
    // Auto-closable operations
} catch (IOException e) {
    e.printStackTrace();
}
```

## 📚 Additional Resources
- Oracle Java I/O Tutorial
- Java File Class Documentation
- Java NIO Package

## 🚀 Conclusion
Understanding casting and file handling is crucial for Java developers. Casting enables type conversion while file handling allows persistent data storage. Always follow best practices to write robust and efficient code.

---

Happy Learning! 🚀📚
