package kaczuch.c0.pl.jkm.Controller;

import kaczuch.c0.pl.jkm.Model.Statement;
import kaczuch.c0.pl.jkm.View.StatementView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatementController
{
    private Statement model;
    private StatementView view;

    public StatementController(Statement model, StatementView view)
    {
        this.model = model;
        this.view = view;
        this.view.addStatementListener(new StatementListener());
        this.view.setVisible(true);
    }

    class StatementListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String statement;
            statement = model.rand_Statement();
            view.setStatement(statement);
        }
    }
}