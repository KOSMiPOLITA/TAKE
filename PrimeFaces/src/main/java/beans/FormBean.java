/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;


import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author erixo
 */
@Named(value = "formbean")
@RequestScoped
public class FormBean {
    
    private Integer value_a = 0;
    private Integer value_b = 0;
    private Integer value_res;
    
    /**
     * Creates a new instance of Manage
     */
    public FormBean() {
    }
    
    public void calculate(){
        value_res = value_a + value_b;
        save_equ();
    }
    
    public void save_equ(){
        FacesContext context = FacesContext.getCurrentInstance();
        String msg = String.format("%d + %d = %d", value_a, value_b, value_res);
        context.addMessage(null, new FacesMessage(msg));
    }

    /**
     * @return the value_a
     */
    public Integer getValue_a() {
        return value_a;
    }

    /**
     * @param value_a the value_a to set
     */
    public void setValue_a(Integer value_a) {
        this.value_a = value_a;
    }

    /**
     * @return the value_b
     */
    public Integer getValue_b() {
        return value_b;
    }

    /**
     * @param value_b the value_b to set
     */
    public void setValue_b(Integer value_b) {
        this.value_b = value_b;
    }

    /**
     * @return the value_res
     */
    public Integer getValue_res() {
        return value_res;
    }

    /**
     * @param value_res the value_res to set
     */
    public void setValue_res(Integer value_res) {
        this.value_res = value_res;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return new Date();
    }

    /**
     * @param cur_date the cur_date to set
     */
    
}
