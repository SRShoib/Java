package New;

public class School {
    int b;
    private Student student;
    public School(int b){
        this.b = b;
        student = new Student(10);
    }

    public void display(){
        System.out.println(this.student);
    }
}
