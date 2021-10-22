package pl.tomczyk.zakupy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowListActivity extends AppCompatActivity {
    public ListView lista;
    public ArrayList<String> listazak ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);
        listazak = ShoppingList.getShoppinglist().item_list;


        ArrayAdapter<String> pokazlisteadapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, listazak);



        lista = (ListView) findViewById(R.id.lista_zakupow);
        lista.setAdapter(pokazlisteadapter);

    }

}



