package Netology.Multithread_Functional.Functional;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String poem =
                "Где обедал, воробей? " +
                        "В зоопарке у зверей. " +
                        "Пообедал я сперва " +
                        "За решеткою у льва. " +
                        "Подкрепился у лисицы. " +
                        "У моржа попил водицы. " +
                        "Ел морковку у слона. " +
                        "С журавлем поел пшена. " +
                        "Погостил у носорога, " +
                        "Отрубей поел немного. " +
                        "Побывал я на пиру " +
                        "У хвостатых кенгуру. " +
                        "Был на праздничном обеде " +
                        "У мохнатого медведя. " +
                        "А зубастый крокодил " +
                        "Чуть меня не проглотил.";

        Function<String, Set<String>> stringToSetConverter = str ->
                Arrays.stream(str.replaceAll("[^A-Za-zА-Яа-я\\u0020]", "")
                                .toLowerCase()
                                .split("\\u0020"))
                        .collect(Collectors.toSet());

        stringToSetConverter.apply(poem)
                .stream()
                .sorted().
                .forEach(System.out::println);
    }
}
