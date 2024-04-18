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
public class rules {
    Scanner s=new Scanner(System.in);
public String showrules(){
    System.out.println("Enter number of books student have borrowed");

  String z;
int q=s.nextInt();
if(q<10){
    z="Let the student borrow the book";
System.out.println((10-q)+" book/s are left for the student to borrow for the rest of the month");}
else{z="The student is not allowed to borrow more";

}

return z;}
}
