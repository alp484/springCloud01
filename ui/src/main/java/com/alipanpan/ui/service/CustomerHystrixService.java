package com.alipanpan.ui.service;


import com.alipanpan.ui.bean.Customer;
import com.alipanpan.ui.bean.Person;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyibo on 2018/6/29.
 * 调用person service的断路器
 */
@Service
public class CustomerHystrixService {

    @Autowired
    CustomerService customerService;

    @HystrixCommand(fallbackMethod = "fallbackSave") //使用HystrixCommand的fallbackMethod参数指定，调用失败的时候调用后备方法 fallbackMethod
    public ResponseEntity<Object> save(Customer customer) {

        return customerService.saveCustomer(customer);
    }

    public ResponseEntity<Object> fallbackSave(Customer customer){
        return new ResponseEntity<>(customer, HttpStatus.FAILED_DEPENDENCY);
    }
}
