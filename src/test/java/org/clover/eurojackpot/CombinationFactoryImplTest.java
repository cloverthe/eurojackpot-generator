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
}