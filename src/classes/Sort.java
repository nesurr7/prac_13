package classes;

import java.util.ArrayList;
import java.util.Comparator;

public class Sort implements Comparator<Student> {

    public static void main(String[] args) {
        ArrayList<Student> Students = new ArrayList<>(){};
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.ID, o2.ID);
    }
}
