import java.util.*;

class TestEmployee {


   public static void main(String arg[]){
      Employee a = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
      Employee b = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee c = new Employee("Joy Rogers",81774,"Manufacturing", "Engineer");



      System.out.println("Name           \t\t ID Number     \t Department      \t Position");
      printInfo(a);
      printInfo(b);
      printInfo(c);
   }
   static void printInfo(Employee e){
      System.out.println(String.format("%-16s \t %d \t\t %-16s \t %-16s ",
            e.GetName(), e.GetIdNumber(), e.GetDepartment(), e.GetPosition()));
   }
}
