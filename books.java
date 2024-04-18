/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

/**
 *
 * @author Blu-Ray
 */
public class books {
    // to get a book name and show it to the user(librarian)

    private String name;
    public author writer;
    public static int counter=0;
    public books(String nameofbook, String author) {
        this.name = nameofbook;
        writer= new author(author);
        counter++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String show() {
        return "'" + name;
    }
    public static void ShowData(books[] book)
    {
        for(int i=0;i<counter;i++)
        {
            System.out.print("Book's name:"+ book[i].name +" ");
            System.out.print("Author's name:"+ book[i].writer.getName());
            System.out.println();
        }
    }
    public static void CheckAvailability(books[] book,String nameofbook)
    {
        for(int i=0;i< counter;i++)
        {
            if(book[i].getName().equalsIgnoreCase(nameofbook))
            {
                System.out.println("The book is available");
                System.out.println("You are allowed to let students borrow 10 books maximum per month");
                rules r1=new rules();
                System.out.println(r1.showrules());
                return;
            }
        }
        System.out.println("The book is not found");
    }
    @Override
    public String toString() {
        return "books{" + "name=" + name + '}';
    }

}
