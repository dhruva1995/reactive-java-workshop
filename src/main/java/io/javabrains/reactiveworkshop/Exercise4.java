package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use R

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono()
            .subscribe(System.out::println);
        System.out.println("Invoked first!");
        // Get the value from the Mono into an integer variable
        Optional<Integer> value = ReactiveSources.intNumberMono()
            .blockOptional();
        
        System.out.println("The returned value is " + value);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
