/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistpractice;

import apcscvm.CVMProgram;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DSTIGANT
 */
public class ArrayListPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        infiniteFamilyInfo();
        //infiniteFamilyInfo( "FamilyInfoInputData.txt" );
        //launchPolygonViewer1();
        //launchPolygonViewer();
    }
    
    public static void infiniteFamilyInfo( String fileName )
    {
        try
        {
            System.setIn( new FileInputStream( new File(fileName) ));
            infiniteFamilyInfo();
        }
        catch( Exception e )
        {
            
        }
    }
    
    // infiniteFamilyInfo
    // reads in new information for family members until the user says they are done
    // then prints out several tables and other lines summarizing the information
    public static void infiniteFamilyInfo()
    {
        Scanner sc = new Scanner( System.in );
        boolean done = false;
        
        // create a list to hold the people
        ArrayList<Person> people = new ArrayList<>();
        
        int personCounter = 1;
        while ( !done )
        {
            // read information for the next person
            System.out.printf("Enter person %d's name \n", personCounter);
            String name = sc.nextLine();
            
            
            System.out.printf("Enter %s's age", name);
            int age = sc.nextInt();
            
            System.out.printf("Enter %s's favourite colour");
            // add a new person to the list
        
            // prompt to see if the user is done
            done = true;
        }
        
        System.out.println("");
        printInfoTable( people );
        
        System.out.println("\nAverage age is " + getAverageAge(people) + "\n" );
        
        System.out.println("\nHere are the names: " + getNames( people) + "\n" );
        System.out.println("\nHere are the favorite colors: " + getFavoriteColors(people) + "\n" );
        System.out.println("\nHere are the favorite colors without duplicates: " + getFavoriteColorsWithoutDuplicates(people) );
        
        
        System.out.println("\nHappy Birthday, everybody!!\n");
        haveBirthdays( people );
        
        printInfoTable( people );
        
        System.out.println("\nHere are the people whose favorite color is green:\n");
        
        ArrayList<Person> greenies = filterFavoriteColorGreen( people );
        printInfoTable( greenies );
        
        System.out.println("\nHere are all the people again:\n" );
        printInfoTable( people );
        
        System.out.println( "\nLet's kill everybody who is over thirty!\n" );
        killOverThirties( people );
        printInfoTable( people );
        
        System.out.println("\nAverage age is " + getAverageAge(people) + "\n" );
        
    }
    
    // printInfoTable
    // consumes a array list of Person
    // prints out a table with the name, age and favorite color of each person 
    public static void printInfoTable( ArrayList<Person> people )
    {
        // display the header
        
        // print out each person's info
        
    }
    
    // getAverageAge
    // calculates the average age of the people in a list of Person
    public static double getAverageAge( ArrayList<Person> people )
    {
        return 0;
    }
    
    // getNames
    // gets a list of the names (Strings) of the people in a list of Person
    public static ArrayList<String> getNames( ArrayList<Person> people )
    {
        return null;
    }
    
    // getFavoriteColors
    // gets a list of the favorite colors of the people in a list of Person
    public static ArrayList<String> getFavoriteColors( ArrayList<Person> people )
    {
        return null;
    }
    
    // haveBirthdays
    // consumes a list of Person and causes each person to have a birthday
    public static void haveBirthdays( ArrayList<Person> people )
    {
        
    }

    // filterFavoriteColorGreen
    // consumes a list of Person and returns a list of all the people in the list
    // that have "green" as their favorite color.  (ignore capitalization so 
    // that people with "Green" "GREEN" "gReEn" etc are included in the returned list)
    public static ArrayList<Person> filterFavoriteColorGreen(ArrayList<Person> people) 
    {
        return null;
    }

    // killOverThirties
    // removes all the people over the age of 30 from the list
    public static void killOverThirties(ArrayList<Person> people) 
    {
    }

    // getFavoriteColorsWithoutDuplicates
    // returns a list of the favorite colors of the people in the list without duplicates
    // Note:  "Green" and "green" are duplicates (ignore case when checking for duplicates)
    public static ArrayList<String> getFavoriteColorsWithoutDuplicates( ArrayList<Person> people )
    {
        return getFavoriteColors( people );
    }
    
    public static void launchPolygonViewer()
    {
        PolygonView cv = new PolygonView();
        ArrayList<Point> p = new ArrayList<>();
        new CVMProgram( "Polygon", 800, 600, cv, cv, p ).start();
    }
    
    public static void launchPolygonViewer1()
    {
        PolygonView cv = new PolygonView();
        ArrayList<Point> p = new ArrayList<>();
        p.add( new Point( 50, 50 ) );
        p.add( new Point( 300, 50 ) );
        p.add( new Point( 400, 200 ) );
        p.add( new Point( 100, 100 ) );
        new CVMProgram( "Polygon", 800, 600, cv, cv, p ).start();
    }
}
