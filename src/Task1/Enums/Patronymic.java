package Task1.Enums;

import java.util.Random;

public enum Patronymic {
    Алексеевич, Иванович, Сергеевич;

    public static String getRundomPatronomic(){
        Patronymic[] values = Patronymic.values();
        int lenght =values.length;
        int randIndex = new Random().nextInt(lenght);
        return String.valueOf(values[randIndex]);
    }
}
