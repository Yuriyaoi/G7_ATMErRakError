/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LogIn_View;

/**
 *
 * @author Yuri
 */
public class LogIn_Con {
   private LogIn_View display;
   public LogIn_Con(){
       display = new LogIn_View();
       display.setActionLogIn(new LogInButtonAction());
       display.setVisible(true);
   } 
    public static void main(String[] args) {
        new LogIn_Con();
    }
    
    private class LogInButtonAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println(display.getUsername());
            System.out.println(display.getPassword());
        }
    }
    
}
