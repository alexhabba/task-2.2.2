package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyService {

    public List<Car> getListCar(Integer count) {
        List<Car> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(new Car(123 + i, 235 + i, "model_" + i));
        }
        return count == null ? list : count <= 5 ? list.stream().limit(count).collect(Collectors.toList()) : list;
    }
}
