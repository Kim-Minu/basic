package com.study.basic;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

public class JasyptTest {

    @Test
    public void 키생성() {

        String value = "qwerty0922";
        String result = jasyptEncoding(value);

        System.out.println(result);

    }


    public String jasyptEncoding(String value) {
        String key = "246f6f70404d24404861474c22763f5a7c4d7e2f694758593563682e51";
        StandardPBEStringEncryptor pbeStringEncryptor = new StandardPBEStringEncryptor();
        pbeStringEncryptor.setAlgorithm("PBEWITHMD5ANDDES");
        pbeStringEncryptor.setPassword(key);
        return pbeStringEncryptor.encrypt(value);

    }

}
