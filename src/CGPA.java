/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CGPA {
  double gpa[] = new double[4];
	double cgpa;
	
	CGPA(){//default constructor
		this.gpa= new double[]{3.12, 3.67, 3.5, 3.56};
		this.cgpa=3.6;
	}
	
	CGPA(double a[], double b){//constructor with parameter
		this.gpa= a;
		this.cgpa= b;
	}
	
	public void printCGPA() {
		CGPA obj1 = new CGPA();
		CGPA obj2 = new CGPA(new double[]{3.12, 3.67, 3.5, 3.56}, 3.6);
		
		//default
		System.out.println("Default Constructor");
		double sum=0, finalCGPA=0;
		for(int i=0; i<obj1.gpa.length; i++) {
			sum+= obj1.gpa[i];
			System.out.println("GPA Sem"+i+ " : "+obj1.gpa[i]);
		}
		finalCGPA= sum/obj1.gpa.length;
		System.out.println("Average GPA "+finalCGPA);
		System.out.println("CGPA : "+obj1.cgpa);
		
		//parameter
		System.out.println("Constructor With Parameter");
		double sum2=0, finalCGPA2=0;
		for(int i=0; i<obj2.gpa.length; i++) {
			sum2= obj2.gpa[i]+sum2;	
			System.out.println("GPA Sem"+i+ " : "+obj2.gpa[i]);
		}
		finalCGPA2=(sum2/obj1.gpa.length);
		System.out.println("Average GPA : "+finalCGPA2);
		System.out.println("CGPA : "+ obj2.cgpa);
		
		
		
	}
	
    
}
