
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
        String name;
        String surname;
        String patronymic;

        Scanner sc = new Scanner(System.in);                                           //Ввод
        System.out.println("Введите имя, фамилию и отчество, разделяя их пробелами");
        String text = sc.nextLine().trim();

        surname = cutStringBetween(text,0,text.indexOf(' '));                   //Расчёт
        name = cutStringBetween(text,text.indexOf(' '),text.lastIndexOf(' '));
        patronymic = cutStringBetween(text,text.lastIndexOf(' '),text.length());

        System.out.println("Фамилия: " + surname );                                    //Вывод
        System.out.println("Имя: " + name );
        System.out.println("Отчество: " + patronymic );
    }
}
