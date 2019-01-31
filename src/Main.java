
/*- Написать программу, которая на входе через консоль принимает фамилию,
имя и отчество одной строкой (например, “Иванов Сергей Петрович”)
и выводит фамилию, имя и отчество отдельно в следующем формате:

        Фамилия: Иванов

        Имя: Сергей

        Отчество: Петрович
*/

import java.util.Scanner;

public class Main
{
    //Вырезаем строку из текста в позициях [begin,end]
    private static String cutStringBetween (String text, int begin, int end)
    {
        String str = " ";
        for (int i=begin; i<end; i++) {
            str += text.charAt(i);
        }
        return str.trim();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя, фамилию и отчество, разделяя их пробелами");
        String text = sc.nextLine().trim();

        System.out.println("Фамилия: " + cutStringBetween(text,0,text.indexOf(' ')) );
        System.out.println("Имя: " + cutStringBetween(text,text.indexOf(' '),text.lastIndexOf(' ')) );
        System.out.println("Отчество: " + cutStringBetween(text,text.lastIndexOf(' '),text.length()));
    }
}
