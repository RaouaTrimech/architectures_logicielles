package com.directi.training.srp.exercice.correction;

import java.util.List;

public class CarFormattor {
	private final CarManager _carMan;
	private List<Car> _carsDb ; 
		
	public  CarFormattor(CarManager carMan)
	    {
			_carMan = carMan;
			_carsDb = _carMan.get_carsDb() ;
	    }
	
	public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
