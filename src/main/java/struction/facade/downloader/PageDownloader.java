package main.java.struction.facade.downloader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:16:06
 */
public class PageDownloader implements Downloader {
    @Override
    public byte[] download(String urlStr) {
        StringBuffer response = new StringBuffer();
        try {
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            System.out.println("Response msg: " + connection.getResponseMessage());

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            connection.disconnect();
            System.out.println(response);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String resStr = response.toString();
        return resStr.getBytes();
    }
}
