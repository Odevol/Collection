package Task1.Enums;

import java.util.Random;

public enum Surname {
    Алексеев, Иванов, Сергеев;

    public static String getRundomSurname() {
        Surname[] values = Surname.values();
        int lenght = values.length;
        int randIndex = new Random().nextInt(lenght);
        return String.valueOf(values[randIndex]);
    }
}