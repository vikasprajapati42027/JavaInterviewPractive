package org.example.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student st=new Student(101,"vikas",27);
        List<Student> list=new ArrayList();
        list.add(st);

        list.forEach(a->System.out.println(a));
     list.forEach(a->System.out.println(a));
        for(Student s:list)
        {
            System.out.println(s.getId());
        }
    }
}
