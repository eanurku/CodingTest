package com.anurag.datastructures.easy.problem08;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Comparator<? super Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {


                return Double.compare(s1.getCgpa(), s2.getCgpa()) == 0 ? (s1.getFname().compareTo(s2.getFname()) == 0 ? Integer.compare(s1.getId(), s2.getId()) : s1.getFname().compareTo(s2.getFname()))

                        : -1 * Double.compare(s1.getCgpa(), s2.getCgpa());
            }
        };
        Collections.sort(studentList, comparator);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
