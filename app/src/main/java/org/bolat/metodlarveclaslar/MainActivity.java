package org.bolat.metodlarveclaslar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username="John";

        System.out.println("on create called");
        testMetodu();
        System.out.println(topla(3,5));
        System.out.println(newMethod("Adem"));

    }

    public void testMetodu() {
        int x=4+4;
        //System.out.println("Value of x="+x);

    }

public  int topla(int a, int b) {

        return a+b;
}

public String newMethod(String adi) {
String sonuc="Sayın "+adi + " "+ username + " size selamlarını iletiyor" ;
return sonuc;
}


    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }
}


