package ua.nure.mishchenko.practice1;

import java.util.stream.Stream;

public class Part2 {
    public static void main(String[] args) {
        System.out.println(sum(args));
    }

    private static int sum(String[] param) {
        if (param == null) {
            return -1;
        }
        if (param.length < 2) {
            return Integer.parseInt(param[0]);
        }
        return Stream.of(param).map(Integer::new).mapToInt(Integer::intValue).sum();
    }
}