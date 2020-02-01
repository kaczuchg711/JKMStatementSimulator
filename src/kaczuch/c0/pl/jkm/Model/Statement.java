package kaczuch.c0.pl.jkm.Model;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * create statement from file
 */
public class Statement
{
    String content;

    public String getContent()
    {
        return content;
    }

    public void rand_Statement()
    {
        try
        {
            File f = new File("src/kaczuch/c0/pl/jkm/data/sentences");
            Scanner scanner = new Scanner(f);
            String line;
            String[] lineAsTable;
            String[] parts = new String[6];
            Random rand = new Random();
            int randNumber;

            for (int i = 0; i < 6; ++i)
            {
                line = scanner.nextLine();
                lineAsTable = line.split(i + 1 + ".");
                randNumber = rand.nextInt(6);
                while (randNumber == 0)
                    randNumber = rand.nextInt(6);

                parts[i] = lineAsTable[randNumber].replaceAll("  ", "");
                System.out.println(randNumber + " " + parts[i]);
            }

            ArrayList<String> out = new ArrayList<>();

            for (String s : parts)
            {
                out.add(s);
            }

            System.out.println(out);


        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

}
