package cn.edu.qut.tools;

import org.apache.shiro.crypto.hash.SimpleHash;

public class MD5Tool {
    public static Object getPassword(String password){
        String hashAlgorithmName = "MD5";
        String credentials = password;
        int hashIterations = 1024;
        Object obj = new SimpleHash(hashAlgorithmName, credentials, null, hashIterations);

        return  obj;
    }
}
