package com.kaleb.factorypattern.factorymethod;

import com.kaleb.factorypattern.Factory;

import android.content.Context;
import android.widget.Toast;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version FactoryMethodFactory, v 0.1 09/05/19 10.14 by Billy Kaleb Hananto
 */
public abstract class FactoryMethodFactory {

    public FactoryMethodFactory() {
    }

    public void FactoryMethodFactoryCreate(Context context, String factoryDecide) {
        Toast.makeText(context, "Created " + createNewFactory(factoryDecide)
                .createSomething() + ", finishing at " + createNewFactory(factoryDecide)
                .workerGoHome() + " with " + createNewFactory(factoryDecide).worker(),
            Toast.LENGTH_SHORT).show();

        System.out.println("Created " + createNewFactory(factoryDecide)
            .createSomething() + ", finishing at " + createNewFactory(factoryDecide).workerGoHome());
    }

    abstract Factory createNewFactory(String factoryDecide);
}
