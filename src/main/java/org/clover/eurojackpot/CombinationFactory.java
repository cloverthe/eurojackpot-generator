package org.clover.eurojackpot;

import java.util.List;

public interface CombinationFactory {
    WinningCombination createCombination();

    List<WinningCombination> createCombinations(int count);
}
