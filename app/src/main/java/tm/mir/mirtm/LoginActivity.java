package tm.mir.mirtm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by muxammed on 27.01.2017.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
//                inet  = isNetworkAvailable();
//                if (inet) {
//                    //Toast.makeText(getApplicationContext(), "Inet bar", Toast.LENGTH_LONG).show();
//                    noinettxt.setVisibility(View.GONE);
//                }
//                else {
//                    //Toast.makeText(getApplicationContext(), "Inet yok", Toast.LENGTH_LONG).show();
//                    noinettxt.setVisibility(View.VISIBLE);
//                }

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                LoginActivity.this.finish();
                startActivity(intent);

            }
        }, 3000);
    }
}
