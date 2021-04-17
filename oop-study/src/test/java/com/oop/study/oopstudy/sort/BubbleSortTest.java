package com.oop.study.oopstudy.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class BubbleSortTest {

    @Test
    @DisplayName("오름차순 버블정렬")
    public void bubbleSortTestAsc() {
        int[] arr = new int[]{ 6, 5, 11, 2, 3, 1, 16 };

        sortBubbleAsc(arr);
        assertThat(arr[0]).isEqualTo(1);
    }

    private void sortBubbleAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}