package kaczuch.c0.pl.jkm.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StatementView extends JFrame
{
    private StatementMainPanel panel;

    public StatementView()
    {
        panel = new StatementMainPanel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("JKM Statement");
        this.setLayout(new FlowLayout());
//        this.getContentPane().setBackground(new Color(panel.getBackground().getRGB()));
        this.getContentPane().setBackground(new Color(0xFFFFFF));


        this.add(panel);
        this.pack();
    }

    public StatementMainPanel getPanel()
    {
        return panel;
    }

    public void addStatementListener(ActionListener listenForRand)
    {
        this.getPanel().getBp().getButtonsList().get(0).addActionListener(listenForRand);
    }

    public void setStatement(String statement)
    {
        this.panel.setText(statement);
    }
}

class StatementMainPanel extends JPanel
{
    private final static int WIDTH = 600;
    private final static int HEIGHT = 300;

    private ButtonPanel bp;
    private JTextField tf;

    public StatementMainPanel()
    {
        String[] names = new String[]
                {
                        "wylosuj",
                };

        this.bp = new ButtonPanel(names);
        this.setLayout(new GridLayout(2, 1));
        this.add(bp);
        this.tf = new JTextField("",120);
        this.add(tf);
    }

    public void setText(String text)
    {
        this.tf.setText(text);
    }

    public ButtonPanel getBp()
    {
        return bp;
    }
}

class ButtonPanel extends JPanel
{
    private ArrayList<JButton> buttonsList;

    public ButtonPanel(String[] names)
    {
        this.buttonsList = new ArrayList<JButton>();

        for (String s : names)
        {
            buttonsList.add(new JButton(s));
        }
        for (JButton b : this.buttonsList)
        {
            this.add(b);
        }
    }

    public ArrayList<JButton> getButtonsList()
    {
        return buttonsList;
    }
}