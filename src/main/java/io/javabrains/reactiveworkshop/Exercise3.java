package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import reactor.core.publisher.Mono;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // TODO: Write code here
        List<Integer> nums = ReactiveSources.intNumbersFlux()
            .toStream()
            .toList();

        System.out.println("List is " + nums);
        System.out.println("Size is: " + nums.size());
        System.out.println("Press a key to end");
        System.in.read();

    }

}
