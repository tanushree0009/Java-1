/*
Write a JAVA program to create a base class “Person” with name and phone number as its attributes. Derive a class “Academic Performance” with Degree and percentage as its attributes from the “Person” class. Display both personal and academic information. Make use of constructor, default constructor, copy constructor and a destructor. Also Derive a class “Sports performance” with sports-name and score as its attribute from the “Person” class. Display personal data along with information about scores obtained in the Sport event.
*/


//import java.util.*;
import java.util.Scanner;

class Person {
	String name;
	long phno;
	Person() {
		name = "";
		phno = 0;
	}
	void display(String n, long ph) {
		name = n;
		phno = ph;
		System.out.println("The name of the student is: " + name);
		System.out.println("The phone number is: " + phno);
	}
}

class Academic_Performance extends Person {
	//super();
	String degree;
	float percentage;
	float s1, s2, s3, s4, s5;
	Academic_Performance(float s1_, float s2_, float s3_, float s4_, float s5_, String deg) {
		s1 = s1_;
		s2 = s2_;
		s3 = s3_;
		s4 = s4_;
		s5 = s5_;
		degree = deg;
		percentage = (s1+s2+s3+s4+s5)/500*100;
		
		System.out.println("The percentage is: " + percentage);
		if(percentage > 40) {
			if(percentage > 90) {
				System.out.println(degree + " Degree awarded!\nGrade: A+");
			}
			else if(percentage > 80) {
				System.out.println(degree + " Degree awarded!\nGrade: A");
			}
			else if(percentage > 70) {
				System.out.println(degree + " Degree awarded!\nGrade: B+");
			}
			else if(percentage > 60) {
				System.out.println(degree + " Degree awarded!\nGrade: B");
			}
			else if(percentage > 50) {
				System.out.println(degree + " Degree awarded!\nGrade: C");
			}
			else {
				System.out.println(degree + " Degree awarded!\nGrade: D");
			}
		}
		else {
			System.out.println("Degree not awarded...");
		}
	}
}

class Sports_Performance extends Person {
	String sportsName;
	float scores;
	Sports_Performance(String name, float score) {
		
		sportsName = name;
		scores = score;
		System.out.println("The name of the sport is: " + sportsName);
		System.out.println("The score in sports is: " + scores);
		if(scores > 8.5) {
			System.out.println("Gold Medal!");
		}
		else if(scores > 7.5) {
			System.out.println("Silver Medal!");
		}
		else if(scores > 6.5) {
			System.out.println("Bronze Medal!");
		}
		else {
			System.out.println("No medal...");
		}
	}
}

class Assignment1 {
	public static void main(String[] args) {
		String name, degree, sportsName;
		float s1, s2, s3, s4, s5, sportScore;
		long phno;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the name of the student: ");
		name = s.nextLine();
		System.out.print("Enter the phone number of the student: ");
		phno = s.nextLong();
		System.out.print("Enter the degree pursued: ");
		degree = s.next();
		System.out.print("Enter the marks of subject 1: ");
		s1 = s.nextFloat();
		System.out.print("Enter the marks of subject 2: ");
		s2 = s.nextFloat();
		System.out.print("Enter the marks of subject 3: ");
		s3 = s.nextFloat();
		System.out.print("Enter the marks of subject 4: ");
		s4 = s.nextFloat();
		System.out.print("Enter the marks of subject 5: ");
		s5 = s.nextFloat();
		System.out.print("Enter the Sports name: ");
		sportsName = s.next();
		System.out.print("Enter the sports score: ");
		sportScore = s.nextFloat();
		
		Academic_Performance a = new Academic_Performance(s1, s2, s3, s4, s5, degree);
		a.display(name, phno);
		Sports_Performance p = new Sports_Performance(sportsName, sportScore);
	}
}


