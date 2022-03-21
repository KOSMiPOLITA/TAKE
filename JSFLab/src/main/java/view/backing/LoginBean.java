/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package view.backing;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.event.ValueChangeEvent;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;
import java.util.ResourceBundle;

/**
 *
 * @author erixo
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {

    private HtmlSelectBooleanCheckbox acceptCheckbox;
    private HtmlCommandButton loginButton;
    private String username;
    private String password;
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    public String login() {
        if (username.equals("scott")){
            if (password.equals("tiger")){
                Scott();
                return "index";
            }
        }
        
        if (username.equals(password)) {
            return "success";
        } else {
            return "failure";
        }
    }
    
    public void activateButton(ValueChangeEvent e)
    {
        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse(); 
        if (acceptCheckbox.isSelected())
            loginButton.setDisabled(false);
        else
            loginButton.setDisabled(true);
    }
    
    /*
    * DODANE:
    */
    public void Scott(){
        ResourceBundle bundle = ResourceBundle.getBundle("ApplicationMessages", FacesContext.getCurrentInstance().getViewRoot().getLocale());
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg = new FacesMessage(bundle.getString("validation.scott"));
        context.addMessage(null, msg);
    }
    


    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the acceptCheckbox
     */
    public HtmlSelectBooleanCheckbox getAcceptCheckbox() {
        return acceptCheckbox;
    }

    /**
     * @param acceptCheckbox the acceptCheckbox to set
     */
    public void setAcceptCheckbox(HtmlSelectBooleanCheckbox acceptCheckbox) {
        this.acceptCheckbox = acceptCheckbox;
    }

    /**
     * @return the loginButton
     */
    public HtmlCommandButton getLoginButton() {
        return loginButton;
    }

    /**
     * @param loginButton the loginButton to set
     */
    public void setLoginButton(HtmlCommandButton loginButton) {
        this.loginButton = loginButton;
    }
    
}
