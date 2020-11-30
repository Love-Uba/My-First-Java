

class Main { //The 
  public static void main(String[] args) {
    System.out.println("Hello world!");
//Student myfood = new Student();
System.out.println(Student.haveEaten("rice"));



//Primitve
  int age = 10;
  boolean eaten = false;
  float distance = 12.84f;
  char grade = 'a';

//Non-Primitive
  String name = "Love";

}

 
}
class Student{
    public boolean eaten(){
     
      String[] books = {"Volvo", "BMW", "Ford", "Mazda"};
      Main.main(books);
      
      return true;
     
    }
    public static boolean haveEaten(String food){
    //This function accepts a string and returns a boolean value
      if (food == "" || food == null){
        return false;
      }else {
          return true;

      }
    }
}
    