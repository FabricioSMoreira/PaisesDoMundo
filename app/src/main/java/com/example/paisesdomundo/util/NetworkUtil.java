package com.example.paisesdomundo.util;

import android.net.Uri;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class NetworkUtil {
    //Filtro para log debug
    static String TAG = "NetworkUtil";

    final static String REST_COUNTRIES_BASE_URL ="https://restcountries.eu/rest/v2/region";

    public static URL buildUrlCountryByRegion(String regionSelected) {
        Uri buildUri = Uri.parse(REST_COUNTRIES_BASE_URL).buildUpon()
                .appendPath(regionSelected).build();
        URL url =  null;
        try{
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static URL buildUrlImgFlag(String urlFlag) {
        Uri buildUri = Uri.parse(urlFlag).buildUpon().build();
        URL url =  null;
        try{
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static String getResponseFromHttpUrl(URL url) throws IOException {
        Log.d(TAG, "metodo getResponseFromHttpUrl");

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }
}
