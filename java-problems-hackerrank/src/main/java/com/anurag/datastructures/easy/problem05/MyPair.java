package com.anurag.datastructures.easy.problem05;

import java.util.Objects;

public class MyPair  {
    private String first;
    private String second;

    public MyPair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

//    @Override
//    public int compareTo(MyPair other) {
//        return this.first.equals(other.getFirst()) && this.second.equals(other.getSecond()) ? 0 : 1;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPair myPair = (MyPair) o;
        return Objects.equals(first, myPair.first) && Objects.equals(second, myPair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "MyPair{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
