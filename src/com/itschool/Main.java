package com.itschool;

import com.itschool.classes.Student;

public class Main {
   public static void main(String[] args) {
      Student student1 = new Student();
      student1.setName("John");
      student1.setGroup("AT201");
      student1.setMathematics((byte) 120);
      System.out.println(student1.getName());

      Student student2 = new Student("Bill", "AT201", (byte) -5, (byte) 0, (byte) 120);
      student2.setMathematics((byte) 60);
      System.out.println(student2);
   }
}
