package info.vziks.designpatterns.structuralpattern.Proxy;

import java.io.IOException;

/**
 * Class TestProxy
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class TestProxy {

    public static void main(String[] args) throws IOException {
        CachingDownloader cachingDownloader = new CachingDownloader();
        cachingDownloader.download("http://example.com/");
        cachingDownloader.download("https://www.google.ru/");

        System.out.println(cachingDownloader.getCache("http://example.com/"));
        System.out.println(cachingDownloader.getCache("https://www.google.ru/"));
        System.out.println(cachingDownloader.getCache("https://www.google.ru/"));
        System.out.println(cachingDownloader.getCache("https://www.google.ru/"));
        System.out.println(cachingDownloader.getCache("https://www.google.ru/"));
    }
}
