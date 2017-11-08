package br.com.truckcontrol.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import static com.orm.SugarRecord.listAll;

public class MainActivity extends AppCompatActivity {

    TextView itemMes;
    TextView cadKm;
    ListView list_view;
    private Spinner categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list_view = (ListView) findViewById(R.id.list_view);
        itemMes = (TextView) findViewById(R.id.itemMes);
        cadKm = (TextView) findViewById(R.id.itemKm);

        //Select no banco
        List<Visualizar> lstVisualizar = Visualizar.listAll(Visualizar.class);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.categoria_mes,
                android.R.layout.simple_spinner_item);
        categoria = (Spinner) findViewById(R.id.cadMes);
        categoria.setAdapter(adapter);

        

    }

    public void inserirCad(View v) {
        setContentView(R.layout.visualizar);

        String mes = itemMes.getText().toString();

        if(mes.isEmpty()) return;

        //criando o obj produto
        Visualizar ver = new Visualizar();

        //adicionando na lista
        adapter.add(ver);

        //adiconando no banco
        ver.save();

    }
}
