/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Login;


/**
 *
 * @author Yuri
 */
    public class LoginControl {
        private Login display;
        private MenuControl menu;
        public LoginControl(){
           display = new Login();
           display.setActionLogIn(new LogInButtonAction());
           display.setActionClose(new closeButtonAction());
           display.setVisible(true);
        } 
        public static void main(String[] args) {
            
            
            new LoginControl();
        }

        private class LogInButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                menu = new MenuControl();
                //menu.setVisible(true);
                display.dispose();
            }
        }
        private class closeButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                //display.dispose();
                System.exit(0);
            }
        }
    }
