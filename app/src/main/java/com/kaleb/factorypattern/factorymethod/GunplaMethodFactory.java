package com.kaleb.factorypattern.factorymethod;

import com.kaleb.factorypattern.Factory;
import com.kaleb.factorypattern.abstractfactory.FactoryWorkerAbstractFactory;
import com.kaleb.factorypattern.abstractfactory.ToyWorkerAbstractFactory;
import com.kaleb.factorypattern.model.FigureModel;
import com.kaleb.factorypattern.model.GunplaModel;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version GunplaMethodFactory, v 0.1 09/05/19 10.21 by Billy Kaleb Hananto
 */
public class GunplaMethodFactory extends FactoryMethodFactory {

    private FactoryWorkerAbstractFactory factoryWorkerAbstractFactory = new ToyWorkerAbstractFactory();

    @Override
    Factory createNewFactory(String factoryDecide) {
        if (factoryDecide.equals("Figure")) {
            return new FigureModel(factoryWorkerAbstractFactory);
        }
        return new GunplaModel(factoryWorkerAbstractFactory);
    }
}
