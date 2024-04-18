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
public class Libraryproject {
static Scanner s=new Scanner(System.in);
static books[] book= new books[5];    
/**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("'Enter your info'");
        librarian l1=new librarian();
        l1.librarianForm(l1);

        student s1= new student ();
        librarian l2= new librarian ();
        System.out.println("'Enter student info'");
        l2.viewForm(s1);
        
        book[0]= new books("Chemistry","Ahmed zeweil");
        book[1] = new books("Physics", "Newton");
        book[2]= new books("Biology", "Magdy");
        book[3] = new books("Geography", "Ahmed");
        book[4] = new books("History","Mohamed");
        books.ShowData(book);
        
       
        System.out.println("Enter name of the book the student will borrow ");
        String bookborrowed=s.nextLine();
        books.CheckAvailability(book, bookborrowed);
       
        
    }
}

    
        

   
