package com.java.beginner.designpatterns;


class SingletonObject {
	
	private static SingletonObject instance = new SingletonObject();
	
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("This is Singleton Object");
	}

}


public class SingletonPattern{
	public static void main(String[] args) {
		SingletonObject object = SingletonObject.getInstance();
		object.showMessage();
	}
}
