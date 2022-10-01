package io.javabrains.reactiveworkshop;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // ReactiveSources.intNumbersFlux()
        //     .subscribe(
        //         System.out::println, 
        //         System.err::println, 
        //         () -> System.out.println("Done with the int flux")
        //     );

        // ReactiveSources.userMono()
        //     .subscribe(
        //         System.out::println,
        //         System.err::println,
        //         () -> System.out.println("Done with the user mono")
        //     );

        MySubscriber sub = new MySubscriber();
        ReactiveSources.userFlux()
            .subscribe(sub);
        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

    public static class MySubscriber extends BaseSubscriber<User> {

        @Override
        protected void hookOnSubscribe(Subscription subscription) {
            // TODO Auto-generated method stub
            System.out.println("Subscribed to the publisher");
            request(2);
        }

        @Override
        protected void hookOnNext(User value) {
            System.out.println(value);
            request(1);
        }

        @Override
        protected void hookOnComplete() {
            System.out.println("Done with publisher");
        }


    }

}