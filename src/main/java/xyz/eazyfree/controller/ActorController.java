package xyz.eazyfree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.eazyfree.mapper.ActorMapper;

/**
 * Created by ZhaoZhi qiang
 * 2018/7/21.16:35
 */
@RestController
public class ActorController {

    @Autowired
    private ActorMapper mapper;

    @GetMapping("/actors")
    private Object findAll(){
        return mapper.findAll();
    }


}
