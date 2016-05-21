package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Tranfer;
public class TranferControl 
{
        private Tranfer tranfer;
        private MenuControl menuControl;
        
        public TranferControl(){
           tranfer = new Tranfer();
           tranfer.setActionBack(new backButtonAction());
           tranfer.setVisible(true);
        } 
        public static void main(String[] args) {
            new TranferControl();
        }

        private class backButtonAction implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                menuControl = new MenuControl();
                tranfer.dispose();
            }
        }
}
