package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.MyService;

import java.util.Optional;

@Controller
public class CarsController {

    @Autowired
    private MyService myService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap modelMap) {
        modelMap.addAttribute("listCars", myService.getListCar(count));
        return "cars";
    }
}
