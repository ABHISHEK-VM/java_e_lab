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
public class AssociateProfessor extends Person{
    
    public AssociateProfessor(String name, String email, String place, String phoneNumber) {
        super(name, email, place, phoneNumber);
    }
    
    @Override
    void createDatabase(){
        System.out.println("Creating Database for Associate Professor...");
    }
    
    
    
}
