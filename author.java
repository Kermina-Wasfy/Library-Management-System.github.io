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
public class author{
    String name;
    private books books;
    public author( String name){
     this.name=name;   
    }
    public books getBooks() {
        return books;}
    public void setBooks(books books) {
        this.books = books; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public int books_number(){
//        return books.length;}
}


