package by.logger.example.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.Properties;

public class FileService {
    public static final FileService SINGLETON = new FileService();
    private static final Logger LOGGER = LogManager.getLogger(FileService.class);

    private FileService() {
    }

    public void renameOldName2(String suffix, String path, File oldName2) {
        if (oldName2.renameTo(new File(path + suffix + "_name2.json")))
            LOGGER.info("oldName2 have been renamed");
    }

    public void renameOldName1(String suffix, String path, File oldName1) {
        if (oldName1.renameTo(new File(path + suffix + "_name1.json")))
            LOGGER.info("oldName1 have been renamed");
    }

    public void checkOldName2(Properties properties, File oldName2) {
        LOGGER.info("Checking oldName2...");
        String file2 = properties.getProperty("file2");
        if (oldName2.canRead() && file2.equals(oldName2.getAbsolutePath())) {
            LOGGER.info(file2 + " - " + true);
            LOGGER.info("Rename oldName2...");
        } else {
            LOGGER.info(file2 + " - " + false);
        }
    }

    public void checkOldName1(Properties properties, File oldName1) {
        LOGGER.info("Checking oldName1...");
        String file1 = properties.getProperty("file1");
        if (oldName1.canRead() && file1.equals(oldName1.getAbsolutePath())) {
            LOGGER.info(file1 + " - " + true);
            LOGGER.info("Rename oldName1...");
        } else {
            LOGGER.info(file1 + " - " + false);
        }
    }
}