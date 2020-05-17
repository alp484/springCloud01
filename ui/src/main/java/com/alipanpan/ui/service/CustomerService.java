package com.alipanpan.ui.service;



import com.alipanpan.ui.bean.Customer;
import com.alipanpan.ui.bean.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yangyibo on 2018/6/29.
 * 使用 Feign 调用person service
 * 我们只需要通过简单在接口中声明方法即可调用Person的 Rest服务
 */
@FeignClient("cms")
@Component
public interface CustomerService {
    @RequestMapping(method = RequestMethod.POST, value = "/restFulAPI/customer",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseEntity<Object> saveCustomer(@RequestBody Customer customer);
}
