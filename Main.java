
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    MyStack studentStack = new MyStack(1);

    System.out.println(studentStack.getLength());
    
    studentStack.add(1,"Kamlesh");

    Student[] allStudents = studentStack.getAllStudents();
    
    for (int i=0; i<allStudents.length;i++ ){
       System.out.println("Rollno: " + allStudents[i].rollNo + ", Name: " +      
       allStudents[i].name);
    }
    
  }
}