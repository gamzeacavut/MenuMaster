package com.example.gamzeacavut;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gamzeacavut.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);

        // Tüm Add butonları
        Button button9 = findViewById(R.id.button9);
        Button button4 = findViewById(R.id.button4);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button8 = findViewById(R.id.button8);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);

        // Confirm butonu
        Button button13 = findViewById(R.id.button13);

        // Tek bir tıklama işlevselliği tanımlama
        View.OnClickListener addClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ürün eklendi mesajı gösterme
                Toast.makeText(getApplicationContext(), "product added!", Toast.LENGTH_SHORT).show();
            }
        };

        // Tüm butonlara aynı tıklama işlevselliğini ekleme
        button9.setOnClickListener(addClickListener);
        button4.setOnClickListener(addClickListener);
        button2.setOnClickListener(addClickListener);
        button3.setOnClickListener(addClickListener);
        button8.setOnClickListener(addClickListener);
        button10.setOnClickListener(addClickListener);
        button11.setOnClickListener(addClickListener);
        button12.setOnClickListener(addClickListener);

        // Confirm butonuna tıklama işlevselliği ekleme
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sipariş alındı mesajı gösterme
                Toast.makeText(getApplicationContext(), "Your order has been received!", Toast.LENGTH_SHORT).show();
            }
        });
        // Butonların rengini takip etmek için bir dizi oluştur
        int[] buttonColors = new int[]{
                Color.GREEN, // Yeşil
                Color.GREEN, // Yeşil
                Color.GREEN, // Yeşil
                Color.GREEN, // Yeşil
                Color.GREEN, // Yeşil
                Color.GREEN, // Yeşil
                Color.GREEN, // Yeşil
                Color.GREEN  // Yeşil
        };

// Butonları diziye yerleştir
        Button[] buttons = new Button[]{
                findViewById(R.id.button9),
                findViewById(R.id.button4),
                findViewById(R.id.button2),
                findViewById(R.id.button3),
                findViewById(R.id.button8),
                findViewById(R.id.button10),
                findViewById(R.id.button11),
                findViewById(R.id.button12)
        };

// Butonların tıklama durumunu takip etmek için bir dizi oluştur
        boolean[] clickedState = new boolean[buttons.length];

// Butonları döngü ile işleyerek her birine tıklama işlevselliği ekleme
        for (int i = 0; i < buttons.length; i++) {
            final int index = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Butonun tıklanma durumunu kontrol et
                    if (!clickedState[index]) {
                        // Eğer daha önce tıklanmamışsa yeşile dönüştür
                        buttons[index].setBackgroundColor(Color.GREEN);
                        clickedState[index] = true;
                    } else {
                        // Eğer daha önce tıklanmışsa turuncuya dönüştür
                        buttons[index].setBackgroundColor(Color.parseColor("#FF5722")); // Turuncu rengi
                        clickedState[index] = false;
                    }
                    // Ürün eklendi mesajı gösterme
                    Toast.makeText(getApplicationContext(), "Product added!", Toast.LENGTH_SHORT).show();
                }
            });
        }
}
}