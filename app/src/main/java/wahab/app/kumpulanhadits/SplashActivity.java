package wahab.app.kumpulanhadits;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by wahab on 13/10/18.
 */

public class SplashActivity extends AppCompatActivity {

    private static final int TIGA_DETIK = 3000; //satuannya milisecon

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        countDown();
    }

    private void countDown() {
        Handler handler = new Handler(); //untuk delay

        Runnable menunggu = new Runnable() { //aksi setelah dia menunggu
            @Override
            public void run() {
                gotoMain(); //method yang akan dipanggil setelah menunggu
            }
        };

        handler.postDelayed(menunggu, TIGA_DETIK); //runnable + satuan waktu
    }

    private void gotoMain() {
        Intent intentMain = new Intent(this, MainActivity.class);
        startActivity(intentMain);
        finish();
    }
}
