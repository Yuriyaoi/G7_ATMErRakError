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
           donate.setActionOrg1(new org1ButtonAction());
           donate.setActionOrg2(new org2ButtonAction());
           donate.setActionOrg3(new org3ButtonAction());
           donate.setActionOrg4(new org4ButtonAction());
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
        private class org1ButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destination = donate.getOrg1().getText();
                donate.setDestinationID(destination);
            }
        }
        
        private class org2ButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destination = donate.getOrg2().getText();
                donate.setDestinationID(destination);
            }
        }
        private class org3ButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destination = donate.getOrg3().getText();
                donate.setDestinationID(destination);
            }
        }
         private class org4ButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String destination = donate.getOrg4().getText();
                donate.setDestinationID(destination);
            }
        }
}
