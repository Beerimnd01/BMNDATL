package src.oops21jan2024;

import java.util.Comparator;

class SortByIdAsc implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class SortByIdDesc implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDesc implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}



public class Student implements Comparable<Student>{


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    String name;

    public Student(Integer id, String name) {
        this.name = name;
        Id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }

    Integer Id;

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.Id,o.Id);
    }
}
