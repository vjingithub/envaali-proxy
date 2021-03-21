package com.envaali.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class ERestClient implements EClient{

    Logger LOGGER = LoggerFactory.getLogger(ERestClient.class);

    public String get(){
        final HttpClient httpClient = new DefaultHttpClient();
        final HttpGet httpGet = new HttpGet("http://localhost:8888/test");
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException ex) {
//            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info("The method is down." + ex.getMessage());
//            }
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        } catch (IOException ex) {
//            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info("The method is down." + ex.getMessage());
//            }
        }
        String line = "";
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException ex) {
//                if (LOGGER.isLoggable(Level.INFO)) {
                    LOGGER.info("The method is down." + ex.getMessage());
//                }
            }
            LOGGER.info(line);
        }
        return line;
    }
}
