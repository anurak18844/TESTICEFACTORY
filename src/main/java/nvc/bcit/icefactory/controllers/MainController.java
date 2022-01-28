package nvc.bcit.icefactory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import nvc.bcit.icefactory.models.Factory;
import nvc.bcit.icefactory.services.FactoryService;

@Controller
public class MainController {
    @Autowired
    FactoryService factoryService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    // @GetMapping("/factory")
    // public String getFactories(){
    //     return "factory";
    // }

    @GetMapping("/factory")
    public ModelAndView factory(){
        List<Factory> factories = factoryService.findAll();
        return new ModelAndView("factory","factories",factories);
    }

    @GetMapping("/factory/{id}")
    public ModelAndView factoryById(@PathVariable("id") int id){
        Factory factory = factoryService.getById(id);
        return new ModelAndView("factory-detail","factory",factory);
    }
}
