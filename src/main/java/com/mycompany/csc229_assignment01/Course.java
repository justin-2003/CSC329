/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
   //Created the date members
   private int ID;
   private String Name;
   private String Code;
   
   //the Setters and Getters for the date members
    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Code
     */
    public String getCode() {
        return Code;
    }

    /**
     * @param Code the Code to set
     */
    public void setCode(String Code) {
        this.Code = Code;
    } 
    //the Default constructor that has the deafult value for id, name and Code
    public Course(){
        this.ID= 12012;
        this.Name = "Moaath";
        this.Code = "CSC229";
    }
    // the overload Constructor that will change the Id, Name and Code
    public Course(int ID, String Name, String Code){
       this.ID = ID;
       this.Name = Name;
       this.Code = Code;
    }
}
