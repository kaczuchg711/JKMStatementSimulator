package kaczuch.c0.pl.jkm.View;

import javax.swing.*;
import java.awt.*;

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
        this.getContentPane().setBackground(new Color(255255255));


        this.add(panel);
        this.pack();
    }

    public StatementMainPanel getPanel()
    {
        return panel;
    }
}

class StatementMainPanel extends JPanel
{
    private final static int WIDTH = 600;
    private final static int HEIGHT = 300;

    public StatementMainPanel()
    {
        String[] names = new String[]
                {
                        "wylosuj",
                };

        ButtonPanel bp = new ButtonPanel(names);
        this.setLayout(new GridLayout(2,1));
        this.add(bp);
        this.add(new JTextField("Ja chcę powiedzieć jedną rzecz ci wszyscy (tfu!) geje z premedytacją próbują skłócić Polskę z Rosją bo tak się uczy w państwowej szkole tak samo zresztą jak za Hitlera."));
    }
}

class ButtonPanel extends JPanel
{
    public ButtonPanel(String[] names)
    {
        for (String s : names)
        {
            add(new JButton(s));
        }
    }
}