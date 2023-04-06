
class MyStack {
  Student[] stack;


  MyStack(int length) {
    this.stack = new Student[length];
  }

  public int getLength () {
    return stack.length;
  }

  public void add (int rollNo, String name) {
    this.stack[0] = new Student(rollNo,name);
  }

  public void remove (int rollNo) {
    int length = this.stack.length;
    if(length != 0){
     this.removeElementUsingIndex(this.findIndex(rollNo));
    }
  }

  public Student[] getAllStudents () {
    return this.stack;
  }

  Student[] removeElementUsingIndex (int index) {
    Student[] newStack = new Student[]{};
    
    for (int i =0, k=0; i < this.stack.length; i++) {
      if(index == i) {
        continue;
      }else{
        newStack[k++] = this.stack[i];
      }
    }

    return newStack;
  }

  int findIndex (int rollNo) {
    Integer index = null;

    for (int i = 0; i<this.stack.length;){
      if(rollNo == this.stack[i].rollNo){
        index = i;
        break;
      }else{
        i++;
      }
    }
    return index;
  }

  
  
}