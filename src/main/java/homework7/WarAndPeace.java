package homework7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.TreeMap;

public class WarAndPeace {
    public static void main(String[] args) {


        Path path = Paths.get("WarAndPeace.txt");
        String read = null;
        try {
            read = String.valueOf(Files.readAllLines(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] text = read.split("[\u201C\u0451,\u044F\u044E," +
                " \u00E9\u00FC\u00E0\u00E8\u00E2\u00E5\u00E7\u00EE\u00E4\u00ED" +
                "\u00EA`\u00F4'\u00FB\u00F6{\u201E\u00A0 \u2026\\[\\] \u00AB" +
                "\u00BB.,\u2014\\-\\/!?\\d\\w{}=()& :;\\s*]");

        TreeMap<String, Integer> result = new TreeMap<>(new SpecialSort());

        for (String word : text) {
            int count = result.getOrDefault(word, 0);
            result.put(word.toLowerCase(), count + 1);
        }

        System.out.println("Shortest word is: " + result.firstEntry().getKey() +
                " Repeats " + result.firstEntry().getValue());

        System.out.println("Longest word: " + result.lastEntry().getKey() +
                " Repeats " + result.lastEntry().getValue());
    }

    public static class SpecialSort implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {

            if (o1.length() > o2.length() && o1.length() > 2 ||
                    o1.length() == o2.length() && o1.compareTo(o2) < 0) {
                return 1;
            } else if (o1.length() == o2.length() && o1.compareTo(o2) == 0) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}

