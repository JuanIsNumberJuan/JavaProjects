//Juan Delgado
//CSC 121


import java.util.*;


public class Employee{

  private String name;

  private int idNumber;

  private String department;

  private String position;



  public Employee(String newName, int id, String dept, String pos){
    SetName(newName);
    SetIdNumber(id);
    SetDepartment(dept);
    SetPosition(pos);
  }


   public Employee(String nam, int id){
     SetName(nam);
     SetIdNumber(id);
     SetDepartment("");
     SetPosition("");
   }

   public Employee(){
     SetName("");
     SetIdNumber(0);
     SetDepartment("");
     SetPosition("");
   }



  public String GetName(){
    return name;
  }


  public int GetIdNumber(){
    return idNumber;
  }


  public String GetDepartment(){
    return department;
  }


  public String GetPosition(){
    return position;
  }



  public void SetName(String nam){
    name = new String(nam);
  }


  public void SetIdNumber(int num){
    idNumber = num;
  }
  public void SetDepartment(String dept){
    department = new String(dept);
  }


  public void SetPosition(String pos){
    position = new String(pos);
  }


}
