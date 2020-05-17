package com.alipanpan.ui.controller;


import com.alipanpan.ui.bean.Customer;
import com.alipanpan.ui.bean.Person;
import com.alipanpan.ui.service.CustomerHystrixService;
import com.alipanpan.ui.service.SomeHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yangyibo on 2018/6/29.
 */
@RestController
public class UiController {
    @Autowired
    private SomeHystrixService someHystrixService;

    @Autowired
    private CustomerHystrixService customerHystrixService;

    @CrossOrigin
   // @RequestMapping(method = RequestMethod.POST, value = "/dispatch",
    //               produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "/dispatch")
    public ResponseEntity<Object> sendMessage(@RequestBody Customer customer) {

        return customerHystrixService.save(customer);
    }

    @RequestMapping(value = "/getsome",produces={MediaType.TEXT_PLAIN_VALUE})
    public String getSome(){
        return someHystrixService.getSome();
    }
}
