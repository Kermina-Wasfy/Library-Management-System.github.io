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
public class person {
      // 'm' or 'f'
    private String gender;
     private String name;
    private int phoneNum;
   private int age;
    private String fathername;
    public person (){
        
    }
    public person(String n,int p,int g,String f,String e){
        name=n;
        phoneNum=p;
       age=g;
       fathername=f;
       gender=e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String showData(){
        return( name+ age+ phoneNum +fathername);
}}
