package info.vziks.designpatterns.structuralpattern.Proxy;

import java.io.IOException;

/**
 * Interface Downloader
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface Downloader {
    void download(String url) throws IOException;

    String getLength();
}
