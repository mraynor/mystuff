package com.varentech.deploya.Form;

import java.util.logging.*;

/**
 * This class creates a new Hash value that changes only when the file changes. Each different file should have a different hash value
 * @author VarenTech
 * @see org.apache.commons.codec.digest.DigestUtils
 * @see java.io.InputStream
 * @see java.io.File
 * @see java.io.FileInputStream
 * @see java.io.IOException
 * @see java.io.FileNotFoundException
 * @see java.security.MessageDigest
 * @see java.security.NoSuchAlgorithmException
 * @see java.util.logging.Logger
 *
 *
 */

public class Hash {
    private static final Logger logger = Logger.getLogger(Hash.class.getName());

    public static void checkSum(String file) {

     /*   String hash_value = null;
        try {
            hash_value = DigestUtils.md5Hex(new FileInputStream(file));
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return hash_value;
   */


    }
}
