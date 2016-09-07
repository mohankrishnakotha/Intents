package vvit.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMap(View v)
    {
        Uri loc = Uri.parse("geo:0,0?q=brooklyn%20bridge%2C%20brooklyn%2C%20ny");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, loc);
        startActivity(mapIntent);

    }
    public void showWebsite(View v)
    {
        Uri webpage = Uri.parse("http://www.android.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void makeCall(View v)
    {
        Uri number = Uri.parse("tel:9948769209");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);

    }
}
