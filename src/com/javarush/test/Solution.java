package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kostya on 11/8/14.
 */



public class Solution
{


    public static void main(String[] args)
    {

        //task_03_06_01();
        //task_03_06_02();
        //task_03_06_04();
        //task_03_06_05();
        //task_03_08_01();
        try {
            task_03_08_02();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task_03_08_02() throws IOException {
        /* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/
        String name, number1, number2;
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        name = bufReader.readLine();
        number1 = bufReader.readLine();
        number2 = bufReader.readLine();
        System.out.println(name + " получает " + number1 +" через " + number2 + " лет.");

    }

    public static void task_03_08_01() throws IOException {
        /* Как захватить мир
    Ввести с клавиатуры число и имя, вывести на экран строку:
    «имя» захватит мир через «число» лет. Му-ха-ха!
    Пример: Вася захватит мир через 8 лет. Му-ха-ха!

    Последовательность вводимых данных имеет большое значение.
    */
        String name, period;
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter period (press 'Enter' to confirm):");
        period = bufReader.readLine();
        System.out.println("Enter name (press 'Enter' to confirm):");
        name = bufReader.readLine();

        System.out.println(name + " захватит мир через " + period + " лет. Му-ха-ха!");
        bufReader.close();
    }


    public static void task_03_06_01(){

        String s1="Мама";
        String s2="Мыла";
        String s3="Раму";
        System.out.print(s1+s2+s3);
        System.out.println();
        System.out.print(s1+s3+s2);
        System.out.println();

        System.out.print(s2+s1+s3);
        System.out.println();
        System.out.print(s2+s3+s1);
        System.out.println();

        System.out.print(s3+s1+s2);
        System.out.println();
        System.out.print(s3+s2+s1);
        System.out.println();

    }

    public static void task_03_06_02(){

        int i,j,k;
        for ( i=1;i<=10;i++){
            k=i;
            for (j=1;j<=10;j++){

                System.out.print(k+" ");
                k+=i;
            }
            System.out.println();
        }

    }

    public static void task_03_06_04(){
        /** Экранирование символов
        *Вывести на экран следующий текст - две строки:

        *It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        *It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
        */

        System.out.print("It\'s Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println();
        System.out.print("It\'s Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");

    }

    public static void task_03_06_05(){
        /* Изучаем японский
        Выведи на экран 日本語
        */
        System.out.print("\u65E5\u672C\u8A9E");
        //System.out.print("日本語");

    }


}
