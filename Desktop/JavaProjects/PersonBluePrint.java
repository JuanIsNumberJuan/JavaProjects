public class PersonBluePrint extends Person{
  public static void main(String[] args){
    Person p1 = new Person();
    System.out.println(p1.name + " " + p1.age);
  }

}


public class Person{

  String name;
  int age;

  public Person(){
    this.name = "John Wick";
    this.age = 18;
    haveBirthdays(2);
  }

  public int haveBirthdays(int years){
    this.age += years;
    return this.age;
  }
}
