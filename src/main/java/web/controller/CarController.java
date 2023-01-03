package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;


@Controller
@RequestMapping("/cars")

public class CarController {

    private final CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String table (Model model) {
        model.addAttribute("cars", carDAO.table());
        return "cars";

    }

//    @GetMapping()
//    public String table ( int count, Model model) {
//        count = 4;
////        List<Car> carList = carDAO.table(count);
//        model.addAttribute("cars", carDAO.table(count));
//        return "cars";
//    }

}
