package pl.wojtek.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        ImageView imageview = findViewById(R.id.imageView);
        //Kolekcje msuza byc w Javie typu obiektowego
        ArrayList <Integer> obrazki = new ArrayList<>();
        obrazki.add(R.drawable.gora1);
        obrazki.add(R.drawable.gora2);
        obrazki.add(R.drawable.gora3);
        obrazki.add(R.drawable.gora4);
        obrazki.add(R.drawable.gora5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "trafiony"
                        //, Toast.LENGTH_SHORT).show();

                //zmieniamy obrazki, bierzemy jakąś wartość
                int indeks = (int) (Math.random()*5);//rzutowanie na wartość int, bo to cyferki. Podajemy ile mamy obrazków i mnożymy pzrez tą liczbę
            imageview.setImageResource(obrazki.get(indeks));//(Zamiana obrazków!!! losowanie)     indeks -> nazwa tej zmiennej
            }
        }
        );

        ListView listView = findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Kliknięcie obsługi listy (jest w zmiennej i)
                imageview.setImageResource(obrazki.get(i));

            }
        });
    }
}