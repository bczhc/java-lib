package pers.zhc.util;

import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author bczhc
 */
public class IOUtils {
    public static void streamWrite(@NotNull InputStream in, OutputStream to) throws IOException {
        int readLen;
        byte[] buf = new byte[4096];
        while ((readLen = in.read(buf)) != -1) {
            to.write(buf, 0, readLen);
            to.flush();
        }
    }

    @NotNull
    public static byte[] streamToByteArray(@NotNull InputStream in) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        streamWrite(in, baos);
        final byte[] bytes = baos.toByteArray();
        baos.close();
        return bytes;
    }
}
