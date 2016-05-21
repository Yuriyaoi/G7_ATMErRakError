package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Donate;
public class DonateControl 
{
    private Donate donate;
    private MenuControl menu;
        
        public DonateControl(){
           donate = new Donate();
           donate.setActionBack(new backButtonAction());
           donate.setVisible(true);
        } 
        public static void main(String[] args) {
            new DonateControl();
        }

        private class backButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                menu = new MenuControl();
                donate.dispose();
            }
        }
}
