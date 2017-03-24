package id.fredriclesomar.androdev.manu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                Toast.makeText(getApplicationContext(), "Isi Data", Toast.LENGTH_LONG).show();
                Intent i = null;
                i = new Intent(MainActivity.this, MainActivity2.class);
                Bundle b = new Bundle();
                i.putExtras(b);

                startActivity(i);

                break;
            case R.id.menu2:
                Toast.makeText(getApplicationContext(), "Hasil", Toast.LENGTH_LONG).show();
                Intent o = null;
                o = new Intent(MainActivity.this, MainActivity3.class);
                Bundle c = new Bundle();
                o.putExtras(c);

                startActivity(o);

        }
        if (item.getItemId() == R.id.menu3) {
          //  case R.id.menu3: <-- tidak dipakai
                Toast.makeText(getApplicationContext(), "Keluar", Toast.LENGTH_LONG).show();
            finish();
        }
       // default: <-- dinonaktifin
        return super.onOptionsItemSelected(item);
    }
}