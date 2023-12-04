package ch.hslu.oop.sw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;

public class FileManager {
    private static final Logger LOG = LoggerFactory.getLogger(FileManager.class);
    public static void writeTextFile(String fileName) {
        var path = getFullPath(fileName);

        // create file if it doesn't exit
        var file = new File(path);
        if (!new File(path).exists()) {
            try {
                LOG.info("creating file...");
                file.createNewFile();
            } catch (IOException e) {
                LOG.error(String.format("IO Exception has occurred: %s", e.getMessage()));
            }
        }

        try (PrintWriter pw =
                     new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                             new FileOutputStream(path), Charset.forName("UTF-8"))));
        ) {
            pw.println(4);
            pw.println("hello");
            pw.println(true);
            pw.flush();
        } catch (IOException ioe) {
            LOG.error(ioe.getMessage(), ioe);
        }
    }

    public static void readTextFile(final String fileName) {
        var path = getFullPath(fileName);

        if (new File(path).exists()) {
            try (BufferedReader br =
                         new BufferedReader(new InputStreamReader(
                                 new FileInputStream(path), Charset.forName("UTF-8")))
            ) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException ioe) {
                LOG.error(ioe.getMessage(), ioe);
            }
        }
    }

    private static String getFullPath(final String fileName) {
        return "src/main/java/ch/hslu/oop/sw11/" + fileName;
    }
}
