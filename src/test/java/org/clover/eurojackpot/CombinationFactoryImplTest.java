package org.clover.eurojackpot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CombinationFactoryImplTest {
    CombinationFactory factory;

    @Test
    void createCombinations() {
        factory = new CombinationFactoryImpl();
        for (int i = 0; i < 100; i++) {
            WinningCombination winningCombination = factory.createCombination();
            Assertions.assertTrue(winningCombination.getNumberMain1() >= 1 && winningCombination.getNumberMain1() <= 50);
            Assertions.assertTrue(winningCombination.getNumberMain2() >= 1 && winningCombination.getNumberMain2() <= 50);
            Assertions.assertTrue(winningCombination.getNumberMain3() >= 1 && winningCombination.getNumberMain3() <= 50);
            Assertions.assertTrue(winningCombination.getNumberMain4() >= 1 && winningCombination.getNumberMain4() <= 50);
            Assertions.assertTrue(winningCombination.getNumberMain5() >= 1 && winningCombination.getNumberMain5() <= 50);
            Assertions.assertTrue(winningCombination.getNumberAdditional1() >= 1 && winningCombination.getNumberAdditional1() <= 12);
            Assertions.assertTrue(winningCombination.getNumberAdditional2() >= 1 && winningCombination.getNumberAdditional2() <= 12);
        }
    }

//    @Test
//    @Ignore("manual")
//    void bruteForce() {
//        factory = new CombinationFactoryImpl();
//        int currentTry = 0;
//
//        List<Integer> mainNumbers = List.of(4, 10, 11, 20, 22);
//        List<Integer> additionalNumbers = List.of(7, 10);
//        WinningCombination trueWinningCombination = new WinningCombination(mainNumbers, additionalNumbers);
//        WinningCombination attempt = factory.createCombination();
//        while (!trueWinningCombination.equals(attempt)) {
//            ++currentTry;
//            System.out.println("Attempt: " + currentTry + ", " + attempt);
//            attempt = factory.createCombination();
//        }
//
//    }

}