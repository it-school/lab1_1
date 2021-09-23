package com.itschool;

import com.itschool.classes.Student;
import com.itschool.classes.Utils;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      Student student1 = new Student();
      student1.setName("John");
      student1.setGroup("AT201");
      student1.setMathematics((byte) 120);
      System.out.println(student1.getName());

      Student student2 = new Student(Utils.getRandomName(), "AT201", (byte) -5, (byte) 0, (byte) 120, -1);
      student2.setMathematics((byte) 60);
      System.out.println(student2);

      System.out.println(LocalDateTime.now());

      int[] a = {1, 2, 3};
      int[] b = a.clone();
      a[0] = 4;
      System.out.println(Arrays.equals(a, b));
   }
}
