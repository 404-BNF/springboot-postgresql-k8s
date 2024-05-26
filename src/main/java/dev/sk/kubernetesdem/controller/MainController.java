package dev.sk.kubernetesdem.controller;

import dev.sk.kubernetesdem.service.DBService;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class MainController {
    @Autowired
    DBService dbService;
    private Logger logger = Logger.getLogger(MainController.class.getName());
    @RequestMapping()
    public String main(){
        return "Kubernetes-Demo";
    }
    @RequestMapping("/testdb")
    public String testDB(){
        logger.info("Testing DB records....");    
        return "Table Row Count: "+dbService.testData();
    }
    
    @GetMapping("/create")
    public String createRecord(@RequestParam String status) {
        logger.info("Creating records in DB...");
        boolean isInserted = dbService.createRecord(status) > 0;
        return isInserted ? "Record Inserted with the status" +status : "Record Insertion Failed for the status" +status;
    }
    

}
