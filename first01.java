class Student{
    String name;
    int rollno;
    void displayStudent(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
    }
}

class CollegeStudent extends Student{
    String collegeName;
    int year;
    void displayCollegeStudent(){
        displayStudent();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year: " + year);
    }
}

class StudentDetails{
    public static void main(String args[]){
        CollegeStudent s = new CollegeStudent();
        s.name = "Raghav";
        s.rollno = 36;
        s.collegeName = "GHRCEM PUNE";
        s.year = 2;
        System.out.println("Student Details:");
        s.displayCollegeStudent();
    }
}