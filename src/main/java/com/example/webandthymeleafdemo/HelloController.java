package com.example.webandthymeleafdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller//nesneleri değil görünüm dosyalarını döndürür
public class HelloController {

    @GetMapping("/")
    String HelloPage(ModelMap map, @RequestParam(required = false)String name){

        name = name == null || name.trim().equals("") ? "Thymeleaf" : name;
        String message = String.format("Merhaba %s!",name);
        map.put("message",message);
        return "index";

    }

}
///ModeuleMap : denetleyiciden görünümlere veri aktarmamızı sağlayan sınıf put methodu ile key-value şeklini alır
// name spring mvcden ,istek ile gelen parametrelere @RequestParam methodu ile eerişiyoruz php gibi get ve post için ayar ayrı anahtar kullanılmaz
//required =false parametere gelmese dahi çalış
