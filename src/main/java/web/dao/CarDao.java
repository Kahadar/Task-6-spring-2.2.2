package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;


@Component
public class CarDao {
    private static int CAR_COUNT;
    private List <Car> automobiles;

    {
        automobiles = new ArrayList<>();
        automobiles.add(new Car(++CAR_COUNT,"VAZ 2101","Very nice"));
        automobiles.add(new Car(++CAR_COUNT,"GAZ 66","Is a super  4x4 truck"));
        automobiles.add(new Car(++CAR_COUNT,"ZAZ 968m","Pizdets, ono ehaet"));
        automobiles.add(new Car(++CAR_COUNT,"Ural","Truck 6x6"));
        automobiles.add(new Car(++CAR_COUNT,"BelAZ","Truck go fuck"));

    }

    public List<Car> tableCars() {
//        if (size == null || size >=5){
            return automobiles;
//        }
//        else{
//            return automobiles.stream().limit(size).collect(Collectors.toList());
//        }
    }

}
