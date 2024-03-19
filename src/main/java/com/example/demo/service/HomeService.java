package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class HomeService {
    public String reverseNumber(String number) {
        char[] chars = number.toCharArray();
        int length = chars.length - 1;

        StringBuilder result = new StringBuilder();
        for (int i = length; i >= 0; i--) {
            result.append(chars[i]);
        }

        int valueResult = Integer.parseInt(result.toString());

        return String.valueOf(valueResult);
    }

    public String isPalindrom(String string) {
        if (string == null || string.isEmpty()) {
            return "Строка пуста";
        }

        char[] chars = string.toCharArray();
        int end = string.length() - 1;
        int start = 0;
        boolean isPalindrome;
        while (end >= 0) {
            if (!Character.isLetter(chars[end])) {
                end--;
                continue;
            }

            if (!Character.isLetter(chars[start])) {
                start++;
                continue;
            }

            isPalindrome = chars[end] == chars[start];

            if (!isPalindrome) {
                return "Это не палиндром";
            }

            end--;
            start++;
        }

        return "Это палиндром";
    }

    public String avgNumber(int sum) {
        char[] chars = String.valueOf(sum).toCharArray();
        int[] intArray = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int arrValue = Integer.valueOf(String.valueOf(chars[i]));
            intArray[i] = arrValue;
        }

        return "Ваше среднее значение: "  + IntStream.of(intArray).average().getAsDouble();
    }
}
