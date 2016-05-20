/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Authentication;
import view.LogIn_View;
import view.Login;
import view.Menu;

/**
 *
 * @author Yuri
 */
    public class LoginControl {
        private Login display;
        private Authentication authen;
        private String username;
        private String password;
        private MenuControl menu;
        public LoginControl(){
           display = new Login();
           display.setActionLogIn(new LogInButtonAction());
           display.setVisible(true);
        } 
        public static void main(String[] args) {
            new LoginControl();
        }
        
        

        private class LogInButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {

                username = display.getUsername();
                password = display.getPassword();
                authen = new Authentication();
                if(authen.loginSuccess(username, password)){
                    menu = new MenuControl();
                    display.dispose();
                } else{
                    display.showPopUp("Wrong Username or Password");
                }                 
            }
        }

    }
