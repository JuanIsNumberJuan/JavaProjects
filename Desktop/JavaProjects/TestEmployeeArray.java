import java.util.*;

class TestEmployeeArray {

   public static void main(String arg[]){
      Employee array [] = new Employee [3];
      array[0] = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
      array[1] = new Employee("Mark Jones", 39119, "IT", "Programmer");
      array[2] = new Employee("Joy Rogers",81774,"Manufacturing", "Engineer");



      System.out.println("Name           \t\t ID Number     \t Department      \t Position");
      for(int i=0; i<array.length; i++) {
         printInfo(array[i]);
      }
   }

   static void printInfo(Employee e){
      System.out.println(String.format("%-16s \t %d \t\t %-16s \t %-16s ",
            e.GetName(), e.GetIdNumber(), e.GetDepartment(), e.GetPosition()));
   }

}
