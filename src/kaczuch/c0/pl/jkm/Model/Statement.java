package kaczuch.c0.pl.jkm.Model;

import java.io.File;
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
            String line = scanner.nextLine();

            String[] stringTable = line.split("1.");

            stringTable[1] = stringTable[1].replaceAll("  ", "");


        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

}
