import java.util.Objects;

record Student(String name, Integer id, Integer age){
    static int counter =0;
    static void incrementCounter(){
        counter++;
    }

    Student{
        Objects.requireNonNull(name);
        incrementCounter();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }


}

public class Question11 {
    public static void main(String[] args) {

        Student s1 = new Student("Sahil",1,23);
        Student s2 = new Student("Sahil",1,23);
        Student s3 = new Student("Sahil",1,23);

        System.out.println(Student.counter);



    }
}
