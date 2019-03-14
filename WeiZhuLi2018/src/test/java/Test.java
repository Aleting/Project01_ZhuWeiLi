import org.apache.shiro.crypto.hash.SimpleHash;

public class Test {

	public static void main(String[] args) {
        String hashAlgorithmName = "MD5";
        String credentials = "123456789";
        int hashIterations = 1024;
        Object obj = new SimpleHash(hashAlgorithmName, credentials, null, hashIterations);
        System.out.println(obj);
    }

}
