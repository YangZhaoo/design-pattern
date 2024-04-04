package main.java.struction.facade;

import main.java.struction.facade.persistence.Persistence;
import main.java.struction.facade.persistence.SaveToDisk;
import main.java.struction.facade.downloader.Downloader;
import main.java.struction.facade.downloader.PageDownloader;
import main.java.struction.facade.parse.ByteParse;
import main.java.struction.facade.parse.Parse;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:16:03
 */
public class DataSyner {
    private Downloader downloader = new PageDownloader();
    private Parse parse = new ByteParse();
    private Persistence persistence = new SaveToDisk();

    public void syncData() {
        byte[] bytes = downloader.download("https://example.com");
        byte[] decodeBytes = parse.parse(bytes);
        persistence.persistence(decodeBytes);
    }
}
