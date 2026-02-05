#Calculator Project 

This is a simple calculator project that allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The project is implemented in Python and provides a user-friendly interface for inputting numbers and selecting the desired operation.

## Lähdekoodi

```java
package osa4_1.Task1;

public class Calculator {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void reset() {
        value = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
        this.value += number;
    }
}

