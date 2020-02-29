package com.geotab.api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class BasicCountroller {
    @RequestMapping(name="/hai",method = RequestMethod.GET)
    public String get(@RequestParam(name="name",required = false,defaultValue = "gunalan") String name) 
    {
    return "Hello"+name;
    }
}
