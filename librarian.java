/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

import java.util.Scanner;

/**
 *
 * @author Blu-Ray
 */
public class librarian extends person {
     private String code;
    private String shift;
    
    public librarian(){
    }
    public librarian(String n,int g, int p, String f,String code,String shift,String e )
    {super(n,g,p,f,e);
    
    this.code=code;
    this.shift=shift;
    
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    
    public void viewForm(student s){
        
   
        Scanner x= new Scanner (System.in);
        System.out.println("Name:");
        String xname=x.nextLine();
        if (xname.equals(s.getName())){
            System.out.println(s.showData());
        }
        System.out.println("Father name:");
         String xfathername=x.nextLine();
        if (xfathername.equals(s.getFathername())){
            System.out.println(s.showData());

        }
        System.out.println("Id:");
        String xid=x.nextLine();
        if (xid.equals(s.getId())){
            System.out.println(s.showData());
        }
            System.out.println("Email:");
        
        String xemail=x.nextLine();
        if (xemail.equals(s.getEmail())){
            System.out.println(s.showData());

        }
       System.out.println("Semester:");
        String xsemester=x.nextLine();
        if (xsemester.equals(s.getSemester())){
            System.out.println(s.showData());

        }
        }    
    public void librarianForm(librarian l){
        
   
        Scanner x= new Scanner (System.in);
        System.out.println("Name:");
        String xname=x.nextLine();
        if (xname.equals(l.getName())){
            System.out.println(l.showData());
        }
        System.out.println("Father name:");
         String xfathername=x.nextLine();
        if (xfathername.equals(l.getFathername())){
            System.out.println(l.showData());

        }
            System.out.println("Code:");
        String xcode=x.nextLine();
        if (xcode.equals(l.getCode())){
            System.out.println(l.showData());

        }
           System.out.println("Shift:");
        String xshift=x.nextLine();
        if (xshift.equals(l.getShift())){
            System.out.println(l.showData());

        }}
}
