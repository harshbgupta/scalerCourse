package dsa.intrermediate2;

import java.util.Map;

public class ClassObject {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(10, 5);
        ComplexNumber b = new ComplexNumber(2, 3);
        ComplexNumber c1 = a.add(b);
        ComplexNumber c2 = a.subtract(b);
        ComplexNumber c3 = a.multiply(b);
        ComplexNumber c4 = a.divide(b);

    }

}

class ComplexNumber {

    float real, imaginary;

    // Define constructor here
    ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber x) {
        // Complete the function
        return new ComplexNumber(this.real + x.real, this.imaginary + x.imaginary);
    }

    ComplexNumber subtract(ComplexNumber x) {
        // Complete the function
        return new ComplexNumber(this.real - x.real, this.imaginary - x.imaginary);
    }

    ComplexNumber multiply(ComplexNumber x) {
        // Complete the function
        float r = x.real * this.real - x.imaginary * this.imaginary;
        float i = this.imaginary * x.real + this.real * x.imaginary;
        return new ComplexNumber(r, i);

    }

    ComplexNumber divide(ComplexNumber x) {
        // Complete the function
        float r = (this.real * x.real + this.imaginary * x.imaginary) / (x.real * x.real + x.imaginary * x.imaginary);
        float i = (this.imaginary * x.real - this.real * x.imaginary) / (x.real * x.real + x.imaginary * x.imaginary);
        return new ComplexNumber(r, i);
    }
}


class Circle {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    float perimeter() {
        return (float) (2 * 3.14 * radius);
    }

    float area() {
        return (float) (Math.pow(radius, 2) * 3.14);
    }
}

class Rectangle {
    // Define properties here
    int length;
    int width;

    // Define constructor here
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int perimeter() {
        // Complete the function
        return 2 * length + 2 * width;
    }

    int area() {
        // Complete the function
        return length * width;
    }
}