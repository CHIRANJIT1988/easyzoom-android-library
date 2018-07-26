package com.easy.imageviewer;

import android.os.AsyncTask;
import android.util.Log;

public class OkHttpClient extends AsyncTask<String, String, String>
{

    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient.Builder().build();


    int responseCode;


    @Override
    protected String doInBackground(String... strings)
    {

        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        builder.url("https://api.androidhive.info/json/airline-tickets.php");
        builder.get();

        okhttp3.Request request = builder.build();

        try
        {
            okhttp3.Response response = client.newCall(request).execute();
            return response.body().string();
        }

        catch (Exception e)
        {

        }

        return null;
    }


    @Override
    protected void onPostExecute(String result)
    {
        Log.i("onPostExecute", "" + result);
    }
}
