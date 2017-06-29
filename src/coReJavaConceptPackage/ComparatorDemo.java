package coReJavaConceptPackage;

import java.util.*;
class Student {
   int roll;
   String name;
   float marks;
   Student(int r, String n, float m) {
      roll = r; name = n; marks = m;
   }
   void display() {
      System.out.println(roll + " " + name + " " + marks);
   }
}

class RollComparator implements Comparator {
   public int compare(Object s1, Object s2) {
      Student stud1 = (Student)s1;
      Student stud2 = (Student)s2;
      if(stud1.roll > stud2.roll)
         return 1;
      else
         return -1;
   }
}

class MarksComparator implements Comparator {
   public int compare(Object s1, Object s2) {
      Student stud1 = (Student)s1;
      Student stud2 = (Student)s2;
      if(stud1.marks == stud2.marks)
         return 0;
      else
      if(stud1.marks < stud2.marks)
         return 1;
      else
         return -1;
   }
}

public class ComparatorDemo {
   public static void main(String[] args) {
      List l = new LinkedList();
      l.add(new Student(7, "Rahul", 85.43f));
      l.add(new Student(9, "Anjali", 95.27f));
      l.add(new Student(5, "Tina", 87.64f));
      System.out.println("Sort student data by Roll no. :-");
      Collections.sort(l, new RollComparator());
      Iterator it = l.iterator();
      while(it.hasNext()) {
         Student s = (Student)it.next();
         s.display();
      }
      System.out.println("Sort student data by Marks :-");
      Collections.sort(l, new MarksComparator());
      it = l.iterator();
      while(it.hasNext()) {
         Student s = (Student)it.next();
         s.display();
      }
   }
}