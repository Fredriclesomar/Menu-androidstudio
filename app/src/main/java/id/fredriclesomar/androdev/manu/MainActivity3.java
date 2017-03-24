package id.fredriclesomar.androdev.manu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends Activity {

    TextView tnama,tnim;
    String get_nama,get_nim;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keluaran);
        tnama = (TextView) findViewById(R.id.tvnama);
        tnim = (TextView) findViewById(R.id.tvnim);

        Bundle b = getIntent().getExtras();

        get_nama = b.getString("parse_nama");
        get_nim = b.getString("parse_nim");

        tnim.setText("Nama : "+get_nama);
        tnama.setText("Nim : "+get_nim);


    }
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(intent);

    }
}
