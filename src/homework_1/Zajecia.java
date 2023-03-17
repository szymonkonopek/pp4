package homework_1;

import java.util.LinkedList;
public class Zajecia {
    public LinkedList<String> students;
    public Zajecia(){
        System.out.println();
        this.students = new LinkedList<>();
    }

    public void enrollStudent(String name){
        if (students.size() < 10) {
            System.out.println("Student " + name + " added !" );
            students.add(name);
        }
        else{
            System.out.println("Im sorry!");
        }
    }

    public String toString(){
        return this.students.toString();
    }

}
