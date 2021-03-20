package com.wildCrane.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStreams {

    public static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();

    public static void main(String[] args) {
        System.out.println("10:30 start learning");
        System.out.println("Sequential sum done in:" +
                measureSumPerf(ParallelStreams::sequentialSum, 10_000_000) + " msecs");
        System.out.println("Iterative sum done in:" +
                measureSumPerf(ParallelStreams::iterativeSum, 10_000_000) + " msecs");
        System.out.println("Parallel sum done in: " +
                measureSumPerf(ParallelStreams::parallelSum, 10_000_000) + " msecs" );
        System.out.println("Parallel RangedSum done in: " +
                measureSumPerf(ParallelStreams::parallelRangedSum, 10_000_000) + " msecs" );
        System.out.println("SideEffect parallel sum done in: " +
                        measureSumPerf(ParallelStreams::sideEffectParallelSum, 10_000_000L) +"msecs" );
        System.out.println("ForkJoin sum done in: " + measureSumPerf(
                ForkJoinSumCalculator::forkJoinSum, 10_000_000) + " msecs" );
    }

    public static long sequentialSum(long n){
        return Stream.iterate(0L,i->i+1).limit(n).reduce(0L,Long::sum);
    }

    public static long iterativeSum(long n){
        long result = 0;
        for(long i = 1L;i<=n;i++){
            result +=i;
        }
        return result;
    }

    public static long parallelSum(long n){
        return Stream.iterate(0L,i->i+1).limit(n).parallel().reduce(0L,Long::sum);
    }

    public static long rangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce(0L, Long::sum);
    }

    public static long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    public static long sideEffectSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).forEach(accumulator::add);
        return accumulator.total;
    }
    public static class Accumulator {
        public long total = 0;
        public void add(long value) { total += value; }
    }

    public static long sideEffectParallelSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        return accumulator.total;
    }

    public static long measureSumPerf(Function<Long,Long> adder,long n){
        long fastest = Long.MAX_VALUE;
        for(int i =0;i<10;i++){
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime()-start);
            System.out.println("Result: "+sum);
            if(duration < fastest){
                fastest = duration;
            }
        }
        return fastest;
    }
}
