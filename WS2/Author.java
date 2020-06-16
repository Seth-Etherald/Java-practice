/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS2;

/**
 *
 * @author seth
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(){
        this.name="Seth Etherald";
        this.email="strunghy@mgmail.com";
        this.gender='m';
    }
    
    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String newMail){
        this.email=newMail;
    }
    public char getGender(){
        return this.gender;
    }
    @Override
    public String toString(){
        return "Author[name="+this.name+",email="+this.email+",gender="+this.gender+"]";
    }
}