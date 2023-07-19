package com.House;

import java.util.ArrayList;
import java.util.List;

public class NumberPermutations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(14500);
        numbers.add(27778);
        numbers.add(38000);
        numbers.add(1470);
        numbers.add(46182);
        numbers.add(13950);
        numbers.add(76540);
        numbers.add(2800);
        numbers.add(7161);
        numbers.add(780);
        numbers.add(1000);
        numbers.add(2007);
        numbers.add(1095);
        numbers.add(9795);
        numbers.add(16170);
        numbers.add(1200);
        numbers.add(110);
        numbers.add(750);
        numbers.add(1010);
        numbers.add(2920);
        numbers.add(1090);
        numbers.add(9200);
        numbers.add(3140);
        numbers.add(7820);
        numbers.add(1990);
        numbers.add(700);
        numbers.add(450);
        numbers.add(1250);
        numbers.add(83000);
        numbers.add(60500);
        numbers.add(900);
        numbers.add(2540);
        numbers.add(50000);

        List<Integer> target1 = new ArrayList<>();
        target1.add(2);
        target1.add(6);
        target1.add(7);
        target1.add(8);
        target1.add(1);
        target1.add(9);

        List<Integer> target2 = new ArrayList<>();
        target2.add(2);
        target2.add(1);
        target2.add(9);
        target2.add(9);
        target2.add(7);
        target2.add(9);

        List<List<Integer>> matchingPermutations = new ArrayList<>();
        generatePermutations(numbers, new ArrayList<>(), matchingPermutations, target1, target2);

        System.out.println("Matching Permutations:");
        for (List<Integer> permutation : matchingPermutations) {
            System.out.println(permutation);
        }
    }

    private static void generatePermutations(List<Integer> numbers, List<Integer> permutation, List<List<Integer>> matchingPermutations, List<Integer> target1, List<Integer> target2) {
        if (permutation.size() == numbers.size()) {
            if (isValidPermutation(permutation, target1, target2)) {
                matchingPermutations.add(new ArrayList<>(permutation));
            }
            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (!permutation.contains(numbers.get(i))) {
                permutation.add(numbers.get(i));
                generatePermutations(numbers, permutation, matchingPermutations, target1, target2);
                permutation.remove(permutation.size() - 1);
            }
        }
    }

    private static boolean isValidPermutation(List<Integer> permutation, List<Integer> target1, List<Integer> target2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (Integer num : target1) {
            sb1.append(num);
        }

        for (Integer num : target2) {
            sb2.append(num);
        }

        StringBuilder current = new StringBuilder();
        for (Integer num : permutation) {
            current.append(num);
        }

        return current.toString().equals(sb1.toString()) || current.toString().equals(sb2.toString());
    }
}
