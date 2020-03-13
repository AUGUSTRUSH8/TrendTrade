package com.augustrush8.trend.web;

import com.augustrush8.trend.config.IpConfiguration;
import com.augustrush8.trend.pojo.Index;
import com.augustrush8.trend.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private IndexService  indexService;
    @Autowired
    private IpConfiguration ipConfiguration;
    @GetMapping("/codes")
    @CrossOrigin
    public List<Index> codes() throws Exception{
        System.out.println("current instance's port is "+ ipConfiguration.getPort());
        return indexService.get();
    }
}
