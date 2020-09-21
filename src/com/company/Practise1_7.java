package com.company;

public class Practise1_7 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle();
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        circle1.makeVisible();
        circle2.makeVisible();
        circle3.makeVisible();
        circle1.moveUp();
        circle1.moveDown();
        circle1.moveRight();
        circle1.moveLeft();
        circle1.changeColor("yellow");
        circle1.changeSize(80);
        circle2.moveUp();
        circle2.moveDown();
        circle2.moveRight();
        circle2.moveLeft();
        circle2.changeColor("green");
        circle2.changeSize(20);
        triangle1.makeVisible();
        triangle2.makeVisible();
        triangle3.makeVisible();
        triangle1.moveUp();
        triangle1.moveRight();
        triangle1.moveLeft();
        triangle1.moveDown();
        triangle1.changeSize(30,40);
        triangle1.changeColor("blue");
        triangle2.moveUp();
        triangle2.moveRight();
        triangle2.moveLeft();
        triangle2.moveDown();
        triangle2.changeSize(20,30);
        triangle2.changeColor("black");
        square1.makeVisible();
        square2.makeVisible();
        square3.makeVisible();
        square1.moveDown();
        square2.changeSize(30);
        square3.changeColor("red");
    }
}
