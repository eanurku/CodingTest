package com.anurag.datastructures.easy.problem10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int ROWS = 6;
        int COLS = 6;
        int sum;
        Integer maxSum=null;

        for (int i = 0; i <= ROWS - 3; i++) {
            for (int j = 0; j <= COLS - 3; j++) {
                    sum = getHourGlassSum(arr, i, j);
                    if(maxSum==null){
                        maxSum=sum;
                    }else if (maxSum < sum) {
                        maxSum = sum;
                    }
            }
        }

        System.out.println(maxSum);

        bufferedReader.close();
    }

    private static int getHourGlassSum(List<List<Integer>> arr, int i, int j) {

        return arr.get(i).get(j) +arr.get(i).get(j+1)+arr.get(i).get(j+2)+
                arr.get(i+1).get(j+1)+
                arr.get(i+2).get(j) +arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);

    }

}
