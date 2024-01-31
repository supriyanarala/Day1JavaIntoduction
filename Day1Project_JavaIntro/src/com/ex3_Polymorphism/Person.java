package com.ex3_Polymorphism;

public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age > 0){
           this.age = age;
        }
        else{
            System.out.println("Age value is invalid");
        }
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
       //if(this.gender == "Male" || this.gender == "Female")
        if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))
       {
           this.gender = gender;
       }
       else{
           System.out.println("Gender value is invalid");
       }

    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public static void main(String []args){
        Person person = new Person("Sup",-3,"fimale");
        System.out.println("name : "+person.getName() +"\n age :"+ person.getAge()+"\n gender :"+ person.getGender());

        person.setName("Supriya");
        person.setAge(10);
        person.setGender("Female");
        System.out.println("name : "+person.getName() +"\n age :"+ person.getAge()+"\n gender :"+ person.getGender());
    }
}
