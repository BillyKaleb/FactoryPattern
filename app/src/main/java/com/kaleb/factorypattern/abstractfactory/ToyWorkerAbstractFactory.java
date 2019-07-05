package com.kaleb.factorypattern.abstractfactory;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version ToyWorkerAbstractFactory, v 0.1 09/05/19 14.00 by Billy Kaleb Hananto
 */
public class ToyWorkerAbstractFactory implements FactoryWorkerAbstractFactory {

    @Override
    public String createWorker() {
        return "Worker lv5";
    }
}
