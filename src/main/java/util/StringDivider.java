package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringDivider {
    private static final String COMMA = ",";
    private static final String BLANK = " ";
    private static final String EMPTY = "";

    public static List<String> divideStringComma(String string) {
        String[] strings = Stream.of(string.split(COMMA))
                .map(s -> s.replaceAll(BLANK, EMPTY))
                .toArray(String[]::new);
        return Arrays.asList(strings);
    }
}
