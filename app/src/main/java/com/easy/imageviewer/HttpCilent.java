package com.easy.imageviewer;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpCilent extends AsyncTask<String, String, String>
{

    HttpURLConnection connection;
    URL url;


    @Override
    protected void onPreExecute()
    {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... strings)
    {

        try
        {
            url = new URL("https://api.androidhive.info/json/airline-tickets.php");

            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            //OutputStream os = connection.getOutputStream();
            //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
            //writer.write("Data to post");
            //writer.flush();
            //writer.close();

            int responseCode = connection.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK)
            {
                InputStream stream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder builder = new StringBuilder();

                String line;

                while ((line = reader.readLine()) != null)
                {
                    builder.append(line);
                }

                return builder.toString();
            }

            return "Unsuccessful";
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }


    @Override
    protected void onPostExecute(String result)
    {
        super.onPostExecute(result);

        Log.i("onPostExecute", "" + result);
    }
}