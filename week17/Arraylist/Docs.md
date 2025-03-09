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