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
public class Person {
    
    String name;
    String email;
    String place;
    String phoneNumber;
    
    Person(String name, String email,String place, String phoneNumber){
        this.name = name;
        this.email = email;
        this.place = place;
        this.phoneNumber = phoneNumber;
    }
    
    void createDatabase(){
        System.out.println("Creating Database for Person...");
    }
    
}
