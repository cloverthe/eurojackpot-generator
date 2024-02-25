package org.clover.eurojackpot;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Random;
import java.util.SplittableRandom;
import java.util.stream.Stream;

@Controller
public class CombinationFactoryImpl implements CombinationFactory {
    @Override
    public WinningCombination createCombination() {
        WinningCombination combination = new WinningCombination();
        List<Integer> mainNumbers = new SplittableRandom().ints(1, 50).distinct().limit(5).boxed().toList();
        List<Integer> additionalNumbers = new Random().ints(1, 12).distinct().limit(5).boxed().toList();
        combination.setNumberMain1(mainNumbers.get(0));
        combination.setNumberMain2(mainNumbers.get(1));
        combination.setNumberMain3(mainNumbers.get(2));
        combination.setNumberMain4(mainNumbers.get(3));
        combination.setNumberMain5(mainNumbers.get(4));

        combination.setNumberAdditional1(additionalNumbers.get(0));
        combination.setNumberAdditional2(additionalNumbers.get(1));
        return combination;
    }

    @Override
    public List<WinningCombination> createCombinations(int count) {
        return Stream.generate(this::createCombination).limit(count).toList();
    }

}
