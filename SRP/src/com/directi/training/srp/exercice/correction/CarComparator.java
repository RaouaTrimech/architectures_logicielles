package com.directi.training.srp.exercice.correction;

import java.util.List;

import com.directi.training.srp.example_refactored.Employee;

public class CarComparator {
	private final CarManager _carMan;
	private List<Car> _carsDb ; 
		
	public  CarComparator(CarManager carMan)
	    {
			_carMan = carMan;
			_carsDb = _carMan.get_carsDb() ;
	    }
	
	public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
