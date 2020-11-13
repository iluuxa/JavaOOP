package ru.Yasko.JavaProject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class Lab20 {
    public static void run(){
        File file=new File("D:/trash/IdeaProjects/JavaOOP/WarAndPeace.txt");
        int[] amount = new int[0];
        String[] word=new String[0];
        int[] tempi;
        String[] temps;
        String curword="";
        char curchar;
        boolean found;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите действие (может занять некоторое время):\n1 - Нахождение наиболее часто используемого слова в 1 томе романа 'Война и мир'\n2 - Замена всех пробелов в 1 томе романа 'Война и мир' на символ '#'");
        int sw=in.nextInt();
        switch (sw) {
            case 1:
            try {
                FileReader fileReader = new FileReader(file);
                int cur = fileReader.read();
                while (cur != -1) {
                    curword = "";
                    curchar = (char) cur;
                    while ((Lab20.isWordSymbol(curchar)) && (cur != -1)) {
                        curword += curchar;
                        cur = fileReader.read();
                        if (cur != -1) {
                            curchar = (char) cur;
                        }
                    }
                    curword = curword.toLowerCase();
                    found = false;
                    for (int i = 0; i < word.length; i++) {
                        if (curword.equals(word[i])) {
                            found = true;
                            amount[i]++;
                        }
                    }
                    if ((!found) && (curword != "")) {
                        tempi = new int[amount.length + 1];
                        temps = new String[word.length + 1];
                        for (int i = 0; i < amount.length; i++) {
                            tempi[i] = amount[i];
                            temps[i] = word[i];
                        }
                        temps[word.length] = curword;
                        tempi[amount.length] = 1;
                        amount = tempi;
                        word = temps;
                    }
                    cur = fileReader.read();
                }
                int max = 0;
                int maxi = -1;
                for (int i = 0; i < amount.length; i++) {
                    //System.out.println(word[i]+"    "+amount[i]);
                    if (amount[i] > max) {
                        maxi = i;
                        max = amount[i];
                    }
                }
                if (maxi != -1) {
                    System.out.println("Наиболее часто встречающееся слово: " + word[maxi] + "\nОно встречается " + amount[maxi] + " раз");
                }
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case 2:
            File file1 = new File("D:/trash/IdeaProjects/JavaOOP/WarAndPeaceRed.txt");
            try {
                FileReader fileReader = new FileReader(file1);

                int cur=1;
                String sfile = "";
                cur = fileReader.read();
                System.out.print(cur);
                while (cur != -1) {
                    if ((char) (cur) == ' ') {
                        sfile += "#";
                    } else {
                        sfile += (char) (cur);
                    }
                    cur = fileReader.read();
                }
                FileWriter fileWriter = new FileWriter(file1);
                if(sfile!=""){
                fileWriter.write(sfile);}
                fileReader.close();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
        }
    }


    public static boolean isWordSymbol(char symbol){
        if((symbol>0)&&(symbol!=' ')&&(!Character.isWhitespace(symbol))&&(symbol!='0')&&(symbol!='1')&&(symbol!='2')&&(symbol!='3')&&(symbol!='4')&&(symbol!='5')&&(symbol!='6')&&(symbol!='7')&&(symbol!='8')&&(symbol!='9')&&(symbol!=',')&&(symbol!='.')&&(symbol!='!')&&(symbol!='?')&&(symbol!=';')&&(symbol!=':')&&(symbol!='"')&&(symbol!=')')&&(symbol!='»')&&(symbol!='«')&&(symbol!='(')&&(symbol!='\n')&&(symbol!=']')&&(symbol!='[')&&(symbol!='–')){
            return true;
        }
        else {
            return false;
        }
    }
}
