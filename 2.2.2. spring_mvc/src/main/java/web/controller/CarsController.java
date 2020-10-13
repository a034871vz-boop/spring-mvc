package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.*;
import web.service.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String getCars(@RequestParam(value = "count", required = false) Integer count,  ModelMap model) {
		List<Car> tmpList = new ArrayList();
		CarService service = new CarServiceImp();
		List<Car> carsList = service.getListCars();
		if(count == null || count > 5) model.addAttribute("cars", carsList);
		else {
			for (int i = 0; i < count; i++) tmpList.add(carsList.get(i));
			model.addAttribute("cars", tmpList);
		}
		return "cars";
	}
}
