package com.kaleb.factorypattern;

import com.kaleb.factorypattern.factorymethod.FactoryMethodFactory;
import com.kaleb.factorypattern.factorymethod.GunplaMethodFactory;
import com.kaleb.factorypattern.simplefactory.SimpleFactoryFactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SimpleFactoryFactory simpleFactoryFactory = new SimpleFactoryFactory();

    private Factory currentFactory;

    private FactoryMethodFactory factoryMethodFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleFactoryExample();

        factoryMethodExample();
    }

    private void simpleFactoryExample() {

        currentFactory = simpleFactoryFactory.createNewFactory("Gunpla");

        if (currentFactory != null) {
            Toast.makeText(this,
                "Created " + currentFactory.createSomething() + ", finishing at " + currentFactory
                    .workerGoHome(), Toast.LENGTH_SHORT).show();
        }

        System.out.println(
            "Created " + currentFactory.createSomething() + ", finishing at " + currentFactory
                .workerGoHome());
    }

    private void factoryMethodExample() {

        factoryMethodFactory = new GunplaMethodFactory();

        factoryMethodFactory.FactoryMethodFactoryCreate(this, "Figure");
    }
}
