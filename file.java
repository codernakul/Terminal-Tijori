import java.io.*;
public class file
{
    static void write()
    {
        try
        {
            String word="";
            for(int i=1;i<=20;i++)
            {
                FileReader fr=new FileReader(System.getProperty("user.dir")+"\\popular.txt");
                BufferedReader br=new BufferedReader(fr);

                FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\"+i+".txt");
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                while((word=br.readLine())!=null)
                    if(word.length()==i)
                        pw.println(word);
                pw.close();
                bw.close();
                fw.close();
                br.close();
                fr.close();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void scan()
    {
        try
        {
            FileReader fr=new FileReader(System.getProperty("user.dir")+"\\popular.txt");
            BufferedReader br=new BufferedReader(fr);
            String big="a",word="";
            while((word=br.readLine())!=null)
            {
                if(word.length()>big.length())
                    big=word;
            }
            System.out.println(big+" "+big.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}