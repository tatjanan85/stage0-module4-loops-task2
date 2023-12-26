package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 0;
        String phrase = "";

        while (count < chars.length) {
            if (chars[count] != ' ' && count != chars.length - 1) {
                phrase += chars[count];
            }
            count++;
        }

        System.out.println(phrase);
    }
}
