package org.jav;

import org.jav.dao.StudentDAO;
import org.jav.models.Student;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Session 24/9/24");
        Student student1 = new Student("23010265", "Javier", "Blandon", "jjespinoza@uamv.edu.ni", "81562958");
        Student student2 = new Student("21220378", "Gabriel", "Diaz", "gdiaz@uamv.edu.ni", "89237472");
        Student student3 = new Student("23010256", "Ligia", "Siezar", "sligia@uamv.edu.ni", "57817823");

        StudentDAO listEst = new StudentDAO();
        System.out.println("Adding students");
        listEst.create(student1);
        listEst.create(student2);
        listEst.create(student3);

        System.out.println("Showing students list");
        for (Student student: listEst.showList()) {
            System.out.println(student);
        }

        System.out.println("Add another student");
        Student oscar = new Student("23000100", "Karla", "Blandon", "Karjav71@uamv.edu.ni", "83813636");
        listEst.create(oscar);

        System.out.println("Showing updated list");
        for (Student student: listEst.showList()) {
            System.out.println(student);
        }
    }
}
