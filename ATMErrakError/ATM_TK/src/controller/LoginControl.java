/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import model.AssignData;
import model.Authentication;
import model.GetData;
import view.LogIn_View;
import view.Login;


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
        private AssignData assignData;
        private GetData getData;
        public LoginControl(){
           display = new Login();
           authen = new Authentication();
           getData = new GetData();
           assignData = new AssignData();
           display.setActionLogIn(new LogInButtonAction());
           display.setActionClose(new closeButtonAction());
           display.setVisible(true);
        } 
        public static void main(String[] args) {
            
            
            new LoginControl();
        }
        
        

        private class LogInButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                username = display.getUsername();
                password = display.getPassword();
                ArrayList<HashMap> list = getData.getUserInfo(username, password);
                if(authen.loginSuccess(list)){
                    assignData.assignInfo(list);
                    menu = new MenuControl();
                    display.dispose();
                } else{
                    display.showPopUp("Wrong Username or Password");
                }                 
            }
        }
        private class closeButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                //display.dispose();
                System.exit(0);
            }
        }
    }
