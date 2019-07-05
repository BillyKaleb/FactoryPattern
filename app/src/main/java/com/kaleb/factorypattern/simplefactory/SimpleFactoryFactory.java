package com.kaleb.factorypattern.simplefactory;

import com.kaleb.factorypattern.model.ComputerModel;
import com.kaleb.factorypattern.Factory;
import com.kaleb.factorypattern.model.GameModel;
import com.kaleb.factorypattern.model.GunplaModel;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version SimpleFactoryFactory, v 0.1 09/05/19 09.25 by Billy Kaleb Hananto
 */
public class SimpleFactoryFactory {

    public Factory createNewFactory(String factoryWanted) {
        Factory factory = null;

        if (factoryWanted.equals("Computer")) {
            factory = new ComputerModel();
        } else if (factoryWanted.equals("Game")) {
            factory = new GameModel();
        } else if (factoryWanted.equals("Gunpla")) {
            factory = new GunplaModel();
        }

        return factory;
    }
}
