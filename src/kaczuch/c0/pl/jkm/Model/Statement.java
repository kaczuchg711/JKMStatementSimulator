package kaczuch.c0.pl.jkm.Model;

import java.io.File;
import java.util.*;

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

    public String rand_Statement()
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

//          reading
            for (int i = 0; i < 6; ++i)
            {
                line = scanner.nextLine();
                lineAsTable = line.split(i + 1 + ".");
                randNumber = rand.nextInt(6);
                while (randNumber == 0)
                    randNumber = rand.nextInt(6);

                parts[i] = lineAsTable[randNumber].replaceAll("  ", "");
            }

            StringBuilder sb = new StringBuilder();
            StringJoiner sj = new StringJoiner(" ");

//          corect string
            int i = 0;
            for (String s : parts)
            {
                sb.append(s);
                if (sb.charAt(sb.length() - 1) == ' ')
                {
                    sb.deleteCharAt(sb.length() - 1);

                }
                sj.add(sb.toString());
                sb.delete(0, sb.length());
                i++;
            }

            return sj.toString() + ".";
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        return "empty";

    }

}
