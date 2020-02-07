package kaczuch.c0.pl.jkm;

import kaczuch.c0.pl.jkm.Controller.StatementController;
import kaczuch.c0.pl.jkm.Model.Statement;
import kaczuch.c0.pl.jkm.View.StatementView;

import java.util.concurrent.locks.StampedLock;

public class Main
{
    public static void main(String[] args)
    {
        StatementView view = new StatementView();
        Statement model = new Statement();
        StatementController sc = new StatementController(model,view);
    }
}
