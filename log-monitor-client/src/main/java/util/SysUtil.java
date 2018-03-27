package util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by yaohao on 2018/3/27.
 */
public class SysUtil {

    public static String host = "";
    public static String userDir = "";

    static {
        if (System.getenv("COMPUTERNAME") != null) {
            host = System.getenv("COMPUTERNAME");
        } else {
            try {
                host = (InetAddress.getLocalHost()).getHostName();
            } catch (UnknownHostException uhe) {
                String host = uhe.getMessage();
                if (host != null) {
                    int colon = host.indexOf(':');
                    if (colon > 0) {
                        host = host.substring(0, colon);
                    }
                }
                host = "UnknownHost";
            }
        }

        userDir = System.getProperty("user.dir", "<NA>");
    }
}