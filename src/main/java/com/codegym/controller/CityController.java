package com.codegym.controller;

import com.codegym.Service.CityService;
import com.codegym.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired private CityService cityService;

    @RequestMapping("/")
    public String index(Model model) {
        List<City> cities = cityService.getAllCity();

        model.addAttribute("cities", cities);

        return "index";
    }

    @RequestMapping(value = "create")
    public String create(Model model) {
        model.addAttribute("city", new City());
        return "create";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(@RequestParam("id") Long userId, Model model) {
        Optional<City> cityEdit = cityService.findCityById(userId);
        cityEdit.ifPresent(city -> model.addAttribute("city", city));
        return "edit";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(City city) {
        cityService.saveCity(city);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam("id") Long cityId, Model model) {
        cityService.deleteCity(cityId);
        return "redirect:/";
    }
}