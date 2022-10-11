import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Январь", "Февраль", "Март", "Январь"};
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] != "") {
                    if (strings[i].equals(strings[j])) {
                        strings[j] = "";
                    }
                }
            }
        }
        System.out.println(Arrays.toString(strings));
        String result = String.join(" ", strings);
        System.out.println("Объединение строк массива - " + result);
    }
}
