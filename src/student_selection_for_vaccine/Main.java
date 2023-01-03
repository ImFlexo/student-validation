
package student_selection_for_vaccine;

import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {
        
        System.out.print("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        
        String [] students = new String [numOfStudents];
        int [] age = new int[numOfStudents];
        
        Scanner scName = new Scanner(System.in);
        Scanner scAge = new Scanner(System.in);
        
        for(int i = 0; i < numOfStudents; i++){
            System.out.print("Enter student name: ");
            students[i] = scName.nextLine();
            System.out.print("Enter student age: ");
            age[i] = scAge.nextInt();
        
        }
        
        for(int i = 0; i < numOfStudents; i++ ){
        if(age[i] >= 15){
            System.out.println(students[i] + " can receive a vaccine.");
            System.out.println(students[i]+" is " + age[i] + " years old!");
        }
          
        else if(age[i] <= 15 && age[i] >= 0){
          
        System.out.println(students[i] + " can't receive a vaccine.");
            System.out.println("because " + students[i] + " is only " + age[i] + " years old!");
        
        }
        else    {
        
            System.out.println("invalid age!");
            
        }
        }
    }
    
}
