package Nedarvning.src.øvelse;

public class App {



    public static void main(String[] args) {
        Person p = new Person("Lasse",1999);
        Student s = new Student("Niels",2000,"Programmering");
        Instructor i = new Instructor("john",1995,28000);

        if(!p.equals(s)){
            System.out.println("det virker");
        }
    }
}
