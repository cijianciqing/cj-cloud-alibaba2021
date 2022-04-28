package cj.springcloud.nacos.consumer.feign.controller;

import cj.springcloud.nacos.consumer.feign.service.CJFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(value = "/nacos/consumer/feign")
public class CJFeignController {
    @Resource
    private CJFeignService cjFeignService;


    @GetMapping(value = "/feighEcho/{string}")
    public String echo(@PathVariable String string){
        log.info(string);
        return cjFeignService.echo(string);
    }
}
