package dev.sk.kubernetesdem.controller;

import dev.sk.kubernetesdem.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    DBService dbService;
    @RequestMapping()
    public String main(){
        return "Kubernetes-Demo";
    }
    @RequestMapping("/testdb")
    public String testDB(){
        return "Table Row Count: "+dbService.testData();
    }
}
