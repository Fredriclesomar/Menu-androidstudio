package id.fredriclesomar.androdev.manu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MainActivity2 extends Activity {
    EditText fieldnama,fieldnim;
    Button tombol;
    String var_nama,var_nim;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fieldnama=(EditText)findViewById(R.id.nama);
        fieldnim=(EditText)findViewById(R.id.nim);
        tombol=(Button)findViewById(R.id.ok);
        Button tombol = (Button) findViewById(R.id.ok);
        tombol.setOnClickListener(new OnClickListener(){


            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                var_nama = fieldnama.getText().toString();
                var_nim = fieldnim.getText().toString();
                Intent i = null;
                i = new Intent(MainActivity2.this, MainActivity3.class);

                Bundle b = new Bundle();

                b.putString("parse_nama", var_nama);
                b.putString("parse_nim", var_nim);

                i.putExtras(b);

                startActivity(i);

            }
        });



    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return false;

    }

}