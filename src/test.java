import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;

public class test {
    public static void main(String[] args) throws IOException {
        URL url=new URL("http://www.baidu.com:80");
//        System.out.println(url.getPath());
//        System.out.println(url.getAuthority());
//        System.out.println(url.get);
        URLConnection connection= url.openConnection();//获取URLConnection对象
        connection.connect();//连接远程资源

    }

}
