package com.java.beginner.exceptions;

public class JavaExceptions {
	
	public static float methodOne(float no1, float no2) {
		return no1/no2;
	}
	
	public static void methodTwo() {
			throw new IllegalAccessError();
	}
	
	public static void methodThree() {
		throw new NullPointerException();
	}
	
	public static void methodFour() throws InvalidNumberException {
		throw new InvalidNumberException();
	}

	public static void main(String[] args) throws InvalidNumberException {
		int num1 = 100;
		int num2 = 20;
		int tot = 0;
		String name[] = new String[3];
		String dep = "ICT";

		try {
			tot = num1 / num2;
			System.out.println("Total : " + tot);

			name[0] = "Jothi";
			name[1] = "Keerthi";
			name[2] = "Hari";
//			name[3] = "Sanju";
			
			for(int i=0; i<name.length; i++) {
				System.out.print(name[i] + " ");
			}

			System.out.println();
			System.out.println("Department Name : " + dep);
			
			System.out.println();
			
//			System.out.println(Integer.parseInt(dep));	// Convert String to integer
			
//			methodTwo();
			
//			methodThree();
			
			methodFour();
			
		} catch (ArithmeticException e) {
			System.out.println("Exception -> Cannot divided by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception -> Array out of bounds, array max length is : " + name.length);
		}catch(NumberFormatException e) {
			System.out.println("Exception -> Cannot Convert string to integer");
		}catch(IllegalAccessError e) {
			System.out.println("Exception -> Illegal access error");
		}catch(NullPointerException e) {
			System.out.println("Exception -> Null pointer exception");
		}catch(InvalidNumberException e) {
			System.out.println("Exception -> Invalid Number exception");
		}

	}

}
