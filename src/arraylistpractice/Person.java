/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistpractice;

/**
 *
 * @author DSTIGANT
 */

// class Person should contain fields for name, age, and favorite colour
// provide:
// a constructor which consumes one value for each field
// getters for each field
// a method called haveBirthday which increments the age field
public class Person 
{
    private final String name, colour;
    private int age;
    
    public Person(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getColor() { return colour; }
    
    public void incAge() { ++age; }
}
