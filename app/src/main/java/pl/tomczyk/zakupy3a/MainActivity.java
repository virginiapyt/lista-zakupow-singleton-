package pl.tomczyk.zakupy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    public ShoppingList listazakupow ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listazakupow = ShoppingList.getShoppinglist();
        AdapterView.OnItemClickListener wybrany = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intentshow = new Intent(MainActivity.this, ShowListActivity.class);
                    startActivity(intentshow);
                } else if (i == 1) {
                    Intent intentedit = new Intent(MainActivity.this, EditListActivity.class);
                    startActivity(intentedit);
                }
            }
        };

        lista = (ListView) findViewById(R.id.listaStartowa);
        lista.setOnItemClickListener(wybrany);
    }
}