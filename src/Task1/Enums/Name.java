package Task1.Enums;

import java.util.Random;

public enum Name {
    Алексей, Иван, Сергей, Андрей, Геннадий, Илья;

    public static String getRundomName() {
        Name[] values = Name.values();
        int lenght = values.length;
        int randIndex = new Random().nextInt(lenght);
        return String.valueOf(values[randIndex]);
    }
}
