package pers.zhc.util.math;

/**
 * @author bczhc
 */
public class Random {
    public static int generate(int min, int max) {
        return (int) (Math.round(Math.random() * (max - min)) + min);
    }
}
