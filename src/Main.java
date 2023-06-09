import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //чтение в буфер введенного значения
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        //регулярка на проверку, число или нет
        String reg = "^[0-9]*[.]?[0-9]+$";

        //Вопрос 1, масса или расстояние
        String course;
        do {
            System.out.println("Текущий курс (рублей за $1): ");
            course = buffer.readLine();
        } while (!(course.matches(reg)) || course.equals("0"));

        String value;
        do {
            System.out.println("Количество рублей: ");
            value = buffer.readLine();
        } while (!(value.matches(reg)));

        System.out.println("Курс доллара (рублей за $1): " + course);
        System.out.println("Количество рублей: " + value);
        System.out.println("Итого: $" + String.format("%.2f",Double.parseDouble(value) / Double.parseDouble(course)));


    }
}