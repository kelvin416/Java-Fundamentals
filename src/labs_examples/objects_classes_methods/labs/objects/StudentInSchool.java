package labs_examples.objects_classes_methods.labs.objects;

//Exercise 04

class StudentInSchool {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Diana Chepkemoi", "Computer Science");
        Student student3 = new Student(true, 23311, 25);
    }
}

class Student{
    String name;
    String course;
    boolean isRegistered;
    int admissionNo;
    int age;

    public Student(){}

    public Student(String name, String course){
        this.name = name;
        this.course = course;
    }

    public Student(boolean isRegistered, int admissionNo, int age){
        this.isRegistered = isRegistered;
        this.admissionNo = admissionNo;
        this.age = age;
    }
}
