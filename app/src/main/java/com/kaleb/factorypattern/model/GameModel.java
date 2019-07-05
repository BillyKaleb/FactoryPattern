package com.kaleb.factorypattern.model;

import com.kaleb.factorypattern.Factory;
import com.kaleb.factorypattern.abstractfactory.FactoryWorkerAbstractFactory;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version GameModel, v 0.1 09/05/19 09.34 by Billy Kaleb Hananto
 */
public class GameModel implements Factory {

    private FactoryWorkerAbstractFactory factoryWorkerAbstractFactory;

    public GameModel() {

    }

    public GameModel(FactoryWorkerAbstractFactory factoryWorkerAbstractFactory) {
        this.factoryWorkerAbstractFactory = factoryWorkerAbstractFactory;
    }

    @Override
    public String worker() {
        return factoryWorkerAbstractFactory.createWorker();
    }

    @Override
    public String createSomething() {
        return "Games, tested and all";
    }

    @Override
    public String workerGoHome() {
        return "sometime 6 PM, sometime 2 AM";
    }
}
