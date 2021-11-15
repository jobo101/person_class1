package person_project1;

public class Main {
	
	public static void main(String[]  args)  {
		
		//creating objects
		Person personOne = new Person("Kim", 40, "Dustbin Man");
		Person personTwo = new Person("Jake", 29, "Tea-taster");
		Person personThree = new Person("Alice", 35, "Fruit-Picker");
		Person personFour = new Person("Ginger", 42, "Pie-Maker");
		Person personFive = new Person("Oliver", 34, "Doctor");	
		
		System.out.println("Person 1");
		System.out.println(personOne.name);
		System.out.println(personOne.age);
		System.out.println(personOne.jobTitle);
		
		System.out.println("Person 2");
		System.out.println(personTwo.name);
		System.out.println(personTwo.age);
		System.out.println(personTwo.jobTitle);
		
		System.out.println("Person 3");
		System.out.println(personThree.name);
		System.out.println(personThree.age);
		System.out.println(personThree.jobTitle);
		
		System.out.println("Person 4");
		System.out.println(personFour.name);
		System.out.println(personFour.age);
		System.out.println(personFour.jobTitle);
		 
		System.out.println("Person 5");
		System.out.println(personFive.name);
		System.out.println(personFive.age);
		System.out.println(personFive.jobTitle);
		
		
		
	}
   static class Person {
	   String name;
	   int age;
	   String jobTitle;
	   //below is the constructor
	   Person(String name, int age, String jobTitle) {
		   this.name = name;
		   this.age = age;
		   this.jobTitle = jobTitle;
		   
	   }	   
		// method to override   
	   public String toString() { 
	         return Person (this.name, this.age, this.jobTitle);
	   
	   
   }
		private String Person(String name2, int age2, String jobTitle2) {
			// TODO Auto-generated method stub
			
			return null;
		}
   }
}
