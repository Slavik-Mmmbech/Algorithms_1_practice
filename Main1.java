package org.example;
import java.util.Arrays;
public class Main {
    static void main(String[] args) {

        }
        // Сложность в худшем и среднем случае: O(n²) — если массив отсортирован в обратном порядке.
        // Сложность в лучшем случае: O(n) — если массив уже отсортирован (алгоритм делает всего один проход).

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > value) {
                a[j + 1] = a[j--];
            }
            a[j + 1] = value;
        }
    }
    }
