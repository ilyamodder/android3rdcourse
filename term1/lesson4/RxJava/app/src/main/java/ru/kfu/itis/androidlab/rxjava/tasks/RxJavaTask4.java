package ru.kfu.itis.androidlab.rxjava.tasks;

import android.support.annotation.NonNull;

import rx.Notification;
import rx.Observable;
import rx.functions.Action1;


public class RxJavaTask4 {

    /**
     * TODO :
     * <p>
     * Method takes boolean stream of single boolean value
     * and two numbers streams
     * <p>
     * If boolean value in stream it true, then you should choose first stream of number,
     * in other case - second
     * <p>
     * If result stream has any number greater than 99, your observable should finish with error
     * <p>
     * Examples:
     * Input boolean stream: (true)
     * First input stream: (5, 19, 12)
     * Second input stream: (9, 210, 87)
     * Result stream: (5, 19, 12)
     * <p>
     * Input boolean stream: (false)
     * First input stream: (5, 19, 12)
     * Second input stream: (9, 210, 87)
     * Result stream: (9, Exception)
     */
    @NonNull
    public static Observable<Integer> task4(@NonNull Observable<Boolean> flagObservable,
                                            @NonNull Observable<Integer> first, @NonNull Observable<Integer> second) {
        return flagObservable.flatMap(flag -> {
            if (flag) {
                return first;
            } else {
                return second;
            }
        }).map(a -> {
            if (a > 99) throw new RuntimeException();
            return a;
        });
    }

}
