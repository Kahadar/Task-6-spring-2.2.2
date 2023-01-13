package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private CarDao carDao;


    public List<Car> tableCars(Integer size){
        if (size == null || size >=5 | size <=0)
        return carDao.tableCars();
        else
        return carDao.tableCars().stream().limit(size).collect(Collectors.toList());
    }

//    public List<Car> tableCars(Integer size) {
//        if (size == null || size >=5 | size <=0){
//            return carDAO.tableCars;
//        }
//        else{
//            return automobiles.stream().limit(size).collect(Collectors.toList());
//        }
//    }
}
