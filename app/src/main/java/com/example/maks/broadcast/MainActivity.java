package com.example.maks.broadcast;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void broadcastIntent(View view)
    {
        Intent intent = new Intent("Intent");
        EditText message = findViewById(R.id.broadmessage);
        intent.putExtra("message", message.getText().toString());
        intent.setAction("com.example.maks.broadcast");
        sendBroadcast(intent);
    }

}
