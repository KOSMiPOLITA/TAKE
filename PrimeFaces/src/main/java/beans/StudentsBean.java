/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author erixo
 */
@Named(value = "studentsbean")
@ApplicationScoped
public class StudentsBean {
    
    private List<String> Names = Arrays.asList("Adam", "Bartek", "Cecylia", "Damian", "Ernest",
                              "Franek", "Greta", "Helena", "Igor", "Julia");
    
    private List<String> Surnames = Arrays.asList("Kowal", "Lapak", "Moniuszko", "Nowak",
                                 "Otto", "Pawlak", "Rosiak", "Sosnek");
    
    private List<Student> students_list; 

    /**
     * Creates a new instance of Students
     */
    public StudentsBean() {
        students_list = createStudents(50);
    }
    
    private List<Student> createStudents(int n){
        List<Student> tmp = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < n; i++){
            tmp.add(createStudent(random));
        }
        return tmp;
    }
    
    private Student createStudent(Random random){
        float avg = 2 + random.nextFloat() * 3;
        Student s = new Student(Names.get(random.nextInt(Names.size())),
             Surnames.get(random.nextInt(Surnames.size())), avg);
        return s;
    }

    /**
     * @return the students_list
     */
    public List<Student> getStudents_list() {
        return students_list;
    }
    
}
