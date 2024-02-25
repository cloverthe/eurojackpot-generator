package org.clover.eurojackpot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


@org.springframework.web.bind.annotation.RestController
public class RestController {
    public static final String DELIMITER = " ||| ";
    protected final CombinationFactory combinationFactory;

    public RestController(CombinationFactory combinationFactory) {
        this.combinationFactory = combinationFactory;
    }

    @GetMapping("/getcombination")
    public ResponseEntity<String> getCombination(@RequestParam(name = "c") int c) {
        List<WinningCombination> combos = combinationFactory.createCombinations(c);
        AtomicInteger counter = new AtomicInteger();
        String result = combos.stream()
                .map(WinningCombination::toString)
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / 3))
                .values().stream()
                .map(group -> String.join(DELIMITER, group))
                .collect(Collectors.joining("<br>"));

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
