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
public class Professor extends Person{
    
    String type;

    public Professor(String name, String email, String place, String phoneNumber, String type) {
        
        super(name, email, place, phoneNumber);
        this.type = type;
    }
    
    @Override
    void createDatabase(){
        System.out.println("Creating Database for professor");
    }
    
    

    
    
}
