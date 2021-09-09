package com.itschool.classes;

import java.util.Locale;

public class Student {
   String name;
   String group;
   byte physics;
   byte mathematics;
   byte history;

   public Student() {
   }

   public Student(String name, String group, byte physics, byte mathematics, byte history) {
      this.name = name;
      this.setGroup(group);
      this.setPhysics(physics);
      this.setMathematics(mathematics);
      this.setHistory(history);
   }

   public String getGroup() {
      return group;
   }

   public void setGroup(String group) {
      this.group = group.toUpperCase(Locale.ROOT);
   }

   public byte getPhysics() {
      return physics;
   }

   public void setPhysics(byte physics) {
      this.physics = physics >= 0 && physics <= 100 ? physics : 0;
   }

   public byte getMathematics() {
      return mathematics;
   }

   public void setMathematics(byte mathematics) {
      this.mathematics = mathematics >= 0 && mathematics <= 100 ? mathematics : 0;
   }

   public byte getHistory() {
      return history;
   }

   public void setHistory(byte history) {
      this.history = history >= 0 && history <= 100 ? history : 0;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", group='" + group + '\'' +
              ", physics=" + physics +
              ", mathematics=" + mathematics +
              ", history=" + history +
              '}';
   }
}
