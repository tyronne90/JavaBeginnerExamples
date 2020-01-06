package com.java.beginner.designpatterns;


 interface Shape {
	void draw();
}

 class Rectangle implements Shape{
	 @Override
	 public void draw() {
		 System.out.println("Rectangle");
	 }
 }

 class Square implements Shape{
	 @Override
	 public void draw() {
		 System.out.println("Square");
	 }
 }

 class Circle implements Shape{
	 @Override
	 public void draw() {
		 System.out.println("Circle");
	 }
 }

 class ShapeFactory{
	
	 public Shape getShape(String shapeType) {
		 if(shapeType == null) {
			 return null;
		 }
		 if(shapeType.equalsIgnoreCase("Rectangle")) {
			 return new Rectangle();
		 }else if(shapeType.equalsIgnoreCase("Square")) {
			 return new Square();
		 }else if(shapeType.equalsIgnoreCase("Circle")) {
			 return new Circle();
		 }
	return null;
	 }
}

public class FactoryPattern {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape rectangle = sf.getShape("Rectangle");
		rectangle.draw();
		Shape square = sf.getShape("Square");
		square.draw();
		Shape circle = sf.getShape("Circle");
		circle.draw();
		
	}

}
