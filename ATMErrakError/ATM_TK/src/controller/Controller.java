package controller;

import model.*;
import view.*;
public class Controller 
{
    public void run()
    {
          new Login().setVisible(true);
          
    }
    public static void main(String[] args)
    {
        Controller controller = new Controller();
        controller.run();
    }
}
