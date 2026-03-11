package com.rajesh.selflearning.Controller;

import com.rajesh.selflearning.interfaces.ProcessClass;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class AddController {

    private final ProcessClass processClass;
    List<ProcessClass> obj;


    @GetMapping(path = "/add")
    public void getAddition() {
        System.out.println(processClass.add(1, 2));
    }

}
