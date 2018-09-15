package ir.androidlife.fcmpusher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.pusher.pushnotifications.PushNotifications;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PushNotifications.start(getApplicationContext(), "25cdc2d2-beac-493b-8c85-a54a5b179806");
        PushNotifications.subscribe("hello");
    }
}
