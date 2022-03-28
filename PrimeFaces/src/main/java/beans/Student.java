/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

/**
 *
 * @author erixo
 */

public class Student {
    
    private String name;
    private String surname;
    private float avg;
    
    public Student(String name, String surname, float avg) {
        this.name = name;
        this.surname = surname;
        this.avg = avg;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the avg
     */
    public float getAvg() {
        return avg;
    }

    /**
     * @param avg the gradesAvg to set
     */
    public void setAvg(float avg) {
        this.avg = avg;
    }
    
}
