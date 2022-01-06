package com.anurag.datastructures.medium.problem04;

import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    List<Student> getStudents(List<String> events) {


        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>((s1, s2) -> {
            if (Double.compare(s1.getCgpa(), s2.getCgpa()) != 0) {
                return -1 * Double.compare(s1.getCgpa(), s2.getCgpa());
            } else if (s1.getName().compareTo(s2.getName()) != 0) {
                return s1.getName().compareTo(s2.getName());
            } else {
                return s1.getId() - s2.getId();
            }
        });

        for(String event:events){
            String[] values = event.split("\\s+");
            //ENTER name CGPA id:
            if(values[0].equals("ENTER")){
                priorityQueue.offer(new Student(Integer.parseInt(values[3]),values[1],Double.parseDouble(values[2])));
            }else{
                Student polledElement = priorityQueue.poll();
            }

        }
        List<Student> tmpList = new ArrayList<>();
        while(!priorityQueue.isEmpty()){
            tmpList.add(priorityQueue.poll());
        }


        return tmpList;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
