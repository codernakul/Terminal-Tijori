//System.out.print(s);

import java.io.*;
public class generate
{
    static void pass(int len,String choice)
    {
        String load[]={
                "[###                    ]",
                "[ ###                   ]",
                "[  ###                  ]",
                "[   ###                 ]",
                "[    ###                ]",
                "[     ###               ]",
                "[      ###              ]",
                "[       ###             ]",
                "[        ###            ]",
                "[         ###           ]",
                "[          ###          ]",
                "[           ###         ]",
                "[            ###        ]",
                "[             ###       ]",
                "[              ###      ]",
                "[               ###     ]",
                "[                ###    ]",
                "[                 ###   ]",
                "[                  ###  ]",
                "[                   ### ]",
                "[                    ###]",
                "[                   ### ]",
                "[                  ###  ]",
                "[                 ###   ]",
                "[                ###    ]",
                "[               ###     ]",
                "[              ###      ]",
                "[             ###       ]",
                "[            ###        ]",
                "[           ###         ]",
                "[          ###          ]",
                "[         ###           ]",
                "[        ###            ]",
                "[       ###             ]",
                "[      ###              ]",
                "[     ###               ]",
                "[    ###                ]",
                "[   ###                 ]",
                "[  ###                  ]",
                "[ ###                   ]",
                "[###                    ]"
            };

        /*String load[]={
        "[###....................]",
        "[.###...................]",
        "[..###..................]",
        "[...###.................]",
        "[....###................]",
        "[.....###...............]",
        "[......###..............]",
        "[.......###.............]",
        "[........###............]",
        "[.........###...........]",
        "[..........###..........]",
        "[...........###.........]",
        "[............###........]",
        "[.............###.......]",
        "[..............###......]",
        "[...............###.....]",
        "[................###....]",
        "[.................###...]",
        "[..................###..]",
        "[...................###.]",
        "[....................###]",
        "[...................###.]",
        "[..................###..]",
        "[.................###...]",
        "[................###....]",
        "[...............###.....]",
        "[..............###......]",
        "[.............###.......]",
        "[............###........]",
        "[...........###.........]",
        "[..........###..........]",
        "[.........###...........]",
        "[........###............]",
        "[.......###.............]",
        "[......###..............]",
        "[.....###...............]",
        "[....###................]",
        "[...###.................]",
        "[..###..................]",
        "[.###...................]",
        "[###....................]",
        };*/

        String numbers[]={"0","1","2","3","4","5","6","7","8","9"};

        String ch[]={
                "a","b","c","d","e","f","g","h","i","j","k","l","m",
                "n","o","p","q","r","s","t","u","v","w","x","y","z",
                "A","B","C","D","E","F","G","H","I","J","K","L","M",
                "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
            };

        String sp[]={
                "a","b","c","d","e","f","g","h","i","j","k","l","m",
                "n","o","p","q","r","s","t","u","v","w","x","y","z",
                "A","B","C","D","E","F","G","H","I","J","K","L","M",
                "N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "!","@","&","#","_","?","!","@","&","#","_","?","!","@","&",
                "0","1","2","3","4","5","6","7","8","9","5","8","3"
            };

        if(choice.equals("4"))
        {
            System.out.print("Generating");
            for(int i=0;i<len;i++)
            {
                System.out.print(load[i%41]);
                Main.password=Main.password+numbers[(int)Math.round(Math.random()*9)];
                System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            }

            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            System.out.println("[Tijori] Done!                                                                     ");
        }

        if(choice.equals("2"))
        {
            System.out.print("Generating");
            for(int i=0;i<len;i++)
            {
                System.out.print(load[i%41]);
                Main.password=Main.password+ch[(int)Math.round(Math.random()*51)];
                System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            }

            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            System.out.println("[Tijori] Done!                                                                     ");
        }

        if(choice.equals("1"))
        {
            System.out.print("Generating");
            for(int i=0;i<len;i++)
            {
                System.out.print(load[i%41]);
                Main.password=Main.password+sp[(int)Math.round(Math.random()*79)];
                System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            }

            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            System.out.println("[Tijori] Done!                                                                     ");
        }

        if(choice.equals("3"))
        {
            try
            {
                int k=0;
                String temp;
                System.out.print("Generating");
                while(len!=0)
                {
                    int n=(int)Math.round(Math.random()*25321);

                    FileReader fr=new FileReader(System.getProperty("user.dir")+"\\popular.txt");
                    BufferedReader br=new BufferedReader(fr);

                    if(k>=40)
                        k=0;
                    System.out.print(load[k++]);

                    for(int j=1;j<=25322;j++)
                    {

                        temp=br.readLine();
                        if(n==j&&len>=temp.length())
                        {
                            Main.password=Main.password+temp;
                            len=len-temp.length();
                            //System.out.print(len+" ");
                            break;
                        }

                        if(len==1)
                        {
                            Main.password=Main.password+"A";
                            len=len-1;
                            break;
                        }
                    }

                    System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");

                    br.close();
                    fr.close();
                }
                System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
                System.out.println("[Tijori] Done!                                                                     ");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}