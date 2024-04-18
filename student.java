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
public class student extends person{
     private String email;
    private String id;
    private String semester;
    

public student(){
}
public student(String n,int g,int p,String f, String e,String id,String email,String semester){
    super(n,g,p,f,e);
    this.id=id;
    this.email=email;
    this.semester=semester;
}


    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getSemester() {
        return semester;
    }
    
    @Override
     public String showData(){
        return(email+id+semester);
    }
}

