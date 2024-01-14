package ch.hslu.oop.sw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;

public class FileManager {
    private static final String TEXT_FILE = "text.txt";
    private static final String BINARY_FILE = "binary.bin";
    private static final Logger LOG = LoggerFactory.getLogger(FileManager.class);

    public static void writeTextFile(final Object input) {
        var path = getFullPath(TEXT_FILE);

        // create file if it doesn't exist
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
                             new FileOutputStream(path, true), Charset.forName("UTF-8"))))) {
            pw.println(input);
        } catch (IOException ioe) {
            LOG.error(ioe.getMessage(), ioe);
        }
    }

    public static void writeBinaryFile(final double value) {
        String path = getFullPath(BINARY_FILE);

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(path, true))) {
            dataOutputStream.writeDouble(value);
        } catch (IOException ioe) {
            LOG.error(ioe.getMessage(), ioe);
        }
    }

    public static void readTextFile() {
        var path = getFullPath(TEXT_FILE);

        readTextFile(path);
    }

    public static void readTextFile(final String path) {
        if (new File(path).exists()) {
            try (BufferedReader br =
                         new BufferedReader(new InputStreamReader(
                                 new FileInputStream(path), Charset.forName("UTF-8")))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException ioe) {
                LOG.error(ioe.getMessage(), ioe);
            }
        } else {
            LOG.error("File does not exist!");
        }
    }

    public static void readBinaryFile() {
        var path = getFullPath(BINARY_FILE);

        if (new File(path).exists()) {
            try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path))) {
                // Loop until the end of the file
                while (dataInputStream.available() > 0) {
                    double doubleValue = dataInputStream.readDouble();
                    System.out.println(doubleValue);
                }
            } catch (IOException ioe) {
                LOG.error(ioe.getMessage(), ioe);
            }
        } else {
            LOG.error("File does not exist!");
        }
    }

    public static String getFullPath(final String fileName) {
        return "src/main/java/ch/hslu/oop/sw11/" + fileName;
    }
}
