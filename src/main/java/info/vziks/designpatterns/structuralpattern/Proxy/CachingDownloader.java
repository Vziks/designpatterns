package info.vziks.designpatterns.structuralpattern.Proxy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Class CachingDownloader
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class CachingDownloader extends RealDownloader implements Downloader {

    private Map<String, RealDownloader> cache;

    @Override
    public void download(String url) throws IOException {

        if (cache == null) {
            cache = new HashMap<>();
        }
        if (!cache.containsKey(url)) {
            RealDownloader downloader = new RealDownloader();
            downloader.download(url);
            cache.put(url, downloader);
        }
    }

    public String getCache(String url) {
        return cache.get(url).getLength();
    }
}
