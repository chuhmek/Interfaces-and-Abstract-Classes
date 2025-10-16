abstract public class Person {
  private String name;

  final int INCREASE_CAP = 20;
  public Person(String name){
    this.name=name;
  }
  public String getName(){
    return "Person`s name is " + name;
  }
  public void changeAdress(String adress){
    System.out.println("New adress is " + adress);
  }
  private void giveDayOff(){
    System.out.println("Giving a day off to " + name);
  }
  public void promote(int percent){
    System.out.println("Promoting a worker ...");
    giveDayOff();
    //calling an abstract method
    increasePay(percent);
  }

  public abstract boolean increasePay(int percent);

  
}
