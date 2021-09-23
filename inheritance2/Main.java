/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("hello");
        
        Professor professor1 = new Professor("Areena", "areena@gmail.com", "Kadakkavoor", "8282838284", "Maths");
        Professor professor2 = new Professor("Abhishek", "abhishek@gmail.com", "Chirayinkeezhu", "8282838284", "Maths");
        Professor professor3 = new Professor("Adithya Vikram", "adithya@gmail.com", "Kadakkavoor", "8282838284", "Maths");

        AssociateProfessor professor4 = new AssociateProfessor("Areena", "areena@gmail.com", "Kadakkavoor", "8282838284");
        AssociateProfessor professor5 = new AssociateProfessor("Abhishek", "abhishek@gmail.com", "Chirayinkeezhu", "8282838284");
        AssociateProfessor professor6 = new AssociateProfessor("Adithya Vikram", "adithya@gmail.com", "Kadakkavoor", "8282838284");
        
        AssistantProfessor professor7 = new AssistantProfessor("Areena", "areena@gmail.com", "Kadakkavoor", "8282838284");
        AssistantProfessor professor8 = new AssistantProfessor("Abhishek", "abhishek@gmail.com", "Chirayinkeezhu", "8282838284");
        AssistantProfessor professor9 = new AssistantProfessor("Adithya Vikram", "adithya@gmail.com", "Kadakkavoor", "8282838284");
        
        
        System.out.println(professor1.email);
        System.out.println(professor5.phoneNumber);
        System.out.println(professor5.name);
        
        professor1.createDatabase();
        professor5.createDatabase();
        
        
                
        
    }
    
}
