import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Zhangkj
 * @date 2019-04-17-20:35
 */
public class Text {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println("本机的IP = " + InetAddress.getLocalHost());
    }

}
