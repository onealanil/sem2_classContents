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
-Not Lightweight (Heavy)
-OS Dependent
-lower
-Fewer Component

2. Swing
- Lightweight
- Customizable
- Faster
- Rich Component

--------------------------Swing Components ----------------------------------------
JFrame - Main Window
JPanel - A container for Component
JDialog - Popup Window
JScrollPane - Scrollable panel
  
------------------------ Common Swing component --------------------------------
Component	Description
JLabel	- Displays text/images
JButton	- Clickable button
JTextField - Single-line text input
JTextArea - Multi-line text input
JCheckBox  - Checkbox selection
JRadioButton - Radio button selection
JComboBox - Dropdown list
JList - List of items

----------------- Action Listener ------------------------------------------
Event --> An action that occurs (click, keypress, etc.).
Event Source --> The component that generates the event (e.g., JButton).
Event Listener --> The interface that listens for events (e.g., ActionListener).
Event Handler --> The method that executes when an event occurs.


---

Happy Learning! 🚀📚
