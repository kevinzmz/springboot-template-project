package com.base.thread;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * PrimeGenerator
 *
 * @author kevin
 * @version 1.0
 * @date 2021/3/25 10:13
 */
public class PrimeGenerator implements Runnable{
    private final List<BigInteger> primes = new ArrayList<>();
    private volatile boolean canceled;

    @Override
    public void run() {
        BigInteger p = BigInteger.ONE;
        while (!canceled){
            p = p.nextProbablePrime();
            synchronized (this){
                primes.add(p);
            }
        }
    }

    public void cancel(){
        canceled = true;
    }

    public synchronized List<BigInteger> get(){
        return new ArrayList<>(primes);
    }
}

class Test{
    List<BigInteger> aSecondOfPrimes() throws InterruptedException {
        PrimeGenerator generator = new PrimeGenerator();

        new Thread(generator).start();

        try{
            SECONDS.sleep(1);
        }finally {
            generator.cancel();
        }

        return generator.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        System.out.println(test.aSecondOfPrimes());
    }
}
