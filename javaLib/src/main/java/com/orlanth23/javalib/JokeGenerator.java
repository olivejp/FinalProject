package com.orlanth23.javalib;

import java.util.Random;

public class JokeGenerator {
    private static String[] jokes = new String[4];

    private static void populateJokes(){
        jokes[0] = "Can a kangaroo jump higher than a house?\n" +
                "-\n" +
                "Of course, a house doesn\'t jump at all.";

        jokes[1] = "Doctor: \"I\'m sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                "\n" +
                "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                "\n" +
                "Doctor: \"Nine.\"";

        jokes[2] = "A man asks a farmer near a field, \"Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.\"\n" +
                "\n" +
                "The farmer says, \"Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.";

        jokes[3] = "Anton, do you think I\'m a bad mother?\n" +
                "\n" +
                "My name is Paul.";
    }

    public static String getJoke() {
        populateJokes();
        Random rand = new Random();
        return jokes[rand.nextInt(4)];
    }
}
