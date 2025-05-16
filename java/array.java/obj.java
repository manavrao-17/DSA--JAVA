//Example of Arrays of Objects

//Example: Here we are taking a student class and creating an array of Student with five Student objects stored in the array. 
//The Student objects have to be instantiated using the constructor of the Student class,and their references should be assigned to the array elements.


// Java program to illustrate creating
//  an array of objects
class Student {
    public int roll_no;
    public String name;
  
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class obj {
    public static void main(String[] args){
      
        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the elements of the array
        arr[0] = new Student(1, "jeny");
        arr[1] = new Student(2, "manav");
        arr[2] = new Student(3, "aadi");
        arr[3] = new Student(4, "vivek");
        arr[4] = new Student(5, "ankit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                               + arr[i].roll_no + " "
                               + arr[i].name+" }");
    
         System.out.println("\n");

//Example: An array of objects is also created like
// Java program to illustrate creating
//  an array of objects
  
class Student{
    public String name;
  
    Student(String name){
        this.name = name;
    }
      
  	@Override
    public String toString(){
        return name;
    }
}
        // declares an Array and initializing the
      	// elements of the array
        Student[] myStudents = new Student[]{
          new Student("jeny"),new Student("manav"),
          new Student("aadi"),new Student("vivek")
        };
  
        // accessing the elements of the specified array
        for(Student m:myStudents){    
            System.out.println(m);
        }
    }
}
    
