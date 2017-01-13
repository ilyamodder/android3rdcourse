package ru.kfu.itis.androidlab.rxjava.tasks;

import android.support.annotation.NonNull;

import java.math.BigInteger;

import rx.Observable;


public class RxJavaTask5 {

    /**
     * TODO : you have two streams of integers of equal length
     * <p>
     * Return one stream of the same length with GCDs
     * of the original streams values
     * <p>
     * Example:
     * Stream 1 (100, 17, 63)
     * Stream 2 (15, 89, 27)
     * Result stream (5, 1, 9)
     * <p>
     * You can use {@link java.math.BigInteger#gcd(BigInteger)}
     */
    @NonNull
    public static Observable<Integer> gcdsObservable(@NonNull Observable<Integer> first,
                                                     @NonNull Observable<Integer> second) {
        return Observable.zip(first, second, (a, b) -> BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)))
                .map(BigInteger::intValue);
    }

}
