package pl.tomczyk.zakupy3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class EditListActivity extends AppCompatActivity {
    public Button clear, add;
    public EditText editText;
    public ArrayList<String> listazak ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_list);
        listazak = ShoppingList.getShoppinglist().item_list;
        clear = (Button) findViewById(R.id.btn_clear);
        add = findViewById(R.id.btn_add);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listazak.clear();

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText  =(EditText) findViewById(R.id.editText_pole);
                String item = editText.getText().toString();

                listazak.add(item);


            }
        });


    }
}