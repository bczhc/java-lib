package pers.zhc.util.concurrent;

/**
 * @author bczhc
 */
public class SpinLatch {
    private volatile boolean stop = false;

    public void await() {
        for (; ; ) {
            if (stop) {
                break;
            }
        }
    }

    public void reset() {
        stop = false;
    }

    public void stop() {
        stop = true;
    }
}

