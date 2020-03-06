package pl.c0.kaczuch.jkm;

import pl.c0.kaczuch.jkm.Controller.StatementController;
import pl.c0.kaczuch.jkm.Model.Statement;
import pl.c0.kaczuch.jkm.View.StatementView;



public class Main
{
    public static void main(String[] args)
    {
        StatementView view = new StatementView();
        Statement model = new Statement();
        StatementController sc = new StatementController(model,view);
    }
}
