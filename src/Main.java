import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        for(int i=0; i<15; i++ ) {
            Student newStudent = new Student();
            newStudent.setId(i);
            newStudent.setGrade(1);
            students.add(newStudent);
        }

        ArrayList<Teacher> teachers = new ArrayList<Teacher>();

        for( int j=0; j<3; j++ ) {
            Teacher newTeacher = new Teacher();
            newTeacher.setId(j);
            newTeacher.setGrade(1);
            teachers.add(newTeacher);
        }

        HashMap<Teacher, HashSet<Student>> classes = new HashMap<Teacher, HashSet<Student>>();

        // each of the three teachers has a class of 5 students
        HashSet<Student> class1 = new HashSet<Student>();
        for( int i=0; i<5; i++) {
            class1.add(students.get(i));
        }
        classes.put(teachers.get(0), class1);

        HashSet<Student> class2 = new HashSet<Student>();
        for( int i=5; i<10; i++) {
            class2.add(students.get(i));
        }
        classes.put(teachers.get(1), class2);

        HashSet<Student> class3 = new HashSet<Student>();
        for( int i=10; i<15; i++) {
            class3.add(students.get(i));
        }
        classes.put(teachers.get(2), class3);

        // print out the map keys in a for loop using keySet()
        for( Teacher t : classes.keySet()) {
            System.out.println(t);
        }

        // print out the map values in a for loop using values()
        for( HashSet s : classes.values() ) {
            System.out.println(s);
        }
    }
}
