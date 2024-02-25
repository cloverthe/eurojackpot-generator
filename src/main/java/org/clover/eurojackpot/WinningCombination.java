package org.clover.eurojackpot;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WinningCombination {
    private int numberMain1;
    private int numberMain2;
    private int numberMain3;
    private int numberMain4;
    private int numberMain5;
    private int numberAdditional1;
    private int numberAdditional2;

    public WinningCombination() {
    }

    public WinningCombination(List<Integer> mainNumbers, List<Integer> additionalNumbers) {
        this.numberMain1 = mainNumbers.get(0);
        this.numberMain2 = mainNumbers.get(1);
        this.numberMain3 = mainNumbers.get(2);
        this.numberMain4 = mainNumbers.get(3);
        this.numberMain5 = mainNumbers.get(4);
        this.numberAdditional1 = additionalNumbers.get(0);
        this.numberAdditional2 = additionalNumbers.get(1);
    }

    public int getNumberMain1() {
        return numberMain1;
    }

    public void setNumberMain1(int numberMain1) {
        this.numberMain1 = numberMain1;
    }

    public int getNumberMain2() {
        return numberMain2;
    }

    public void setNumberMain2(int numberMain2) {
        this.numberMain2 = numberMain2;
    }

    public int getNumberMain3() {
        return numberMain3;
    }

    public void setNumberMain3(int numberMain3) {
        this.numberMain3 = numberMain3;
    }

    public int getNumberMain4() {
        return numberMain4;
    }

    public void setNumberMain4(int numberMain4) {
        this.numberMain4 = numberMain4;
    }

    public int getNumberMain5() {
        return numberMain5;
    }

    public void setNumberMain5(int numberMain5) {
        this.numberMain5 = numberMain5;
    }

    public int getNumberAdditional1() {
        return numberAdditional1;
    }

    public void setNumberAdditional1(int numberAdditional1) {
        this.numberAdditional1 = numberAdditional1;
    }

    public int getNumberAdditional2() {
        return numberAdditional2;
    }

    public void setNumberAdditional2(int numberAdditional2) {
        this.numberAdditional2 = numberAdditional2;
    }

    public List<Integer> getMainNumbersSorted() {
        return Stream.of(numberMain1, numberMain2, numberMain3, numberMain4, numberMain5).sorted().toList();
    }

    public List<Integer> getAdditionalNumbersSorted() {
        return Stream.of(numberAdditional1, numberAdditional2).sorted().toList();
    }

    @Override
    public String toString() {
        String result = getMainNumbersSorted().stream().map(String::valueOf).collect(Collectors.joining(", "));
        result += " : " + getAdditionalNumbersSorted().stream().map(String::valueOf).collect(Collectors.joining(", "));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WinningCombination that = (WinningCombination) o;
        return numberMain1 == that.numberMain1 && numberMain2 == that.numberMain2 && numberMain3 == that.numberMain3 && numberMain4 == that.numberMain4 && numberMain5 == that.numberMain5 && numberAdditional1 == that.numberAdditional1 && numberAdditional2 == that.numberAdditional2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberMain1, numberMain2, numberMain3, numberMain4, numberMain5, numberAdditional1, numberAdditional2);
    }

}
