package info.vziks.designpatterns.structuralpattern.Proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * Class RealDownloader
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class RealDownloader implements Downloader {

    private int length;

    @Override
    public void download(String url) throws IOException {

        System.out.println("Download page");
        URL urlObject = new URL(url);
        URLConnection conn = urlObject.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder output = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            output.append(inputLine);
        }
        in.close();

        final byte[] utf8Bytes = output.toString().getBytes(StandardCharsets.UTF_8);

        this.length = utf8Bytes.length;

    }

    public String getLength() {
        return "Downloaded bytes: " + this.length;
    }
}
