package ru.kfu.itis.androidlab.rxjava.tasks;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import rx.Observable;


public class RxJavaTask2 {

    /**
     * TODO:
     * <p>
     * Method takes observable of strings as a parameter
     * <p>
     * Supply all elements until you meet word END in the stream (END word should be excluded)
     * After that remove all repeated values from the stream
     */
    @NonNull
    public static Observable<String> task2(@NonNull Observable<String> observable) {
        return observable
                .skipUntil(Observable.just("END"))
                .filter(s -> !"END".equals(s))
                .distinct();
    }

}
