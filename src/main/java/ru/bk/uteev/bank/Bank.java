package ru.bk.uteev.bank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.bk.uteev.helpdata.CardInfo;

import java.util.Date;
import java.util.Map;

@Controller
public class Bank {

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @PostMapping("/")
    public String getRequest(@RequestParam String amount,
                           @RequestParam String time,
                           @RequestParam String cardInfo,
                           @RequestParam String urlForAnswer

    ){
        System.out.println(amount+", "+ time + ", " + cardInfo + ", " + urlForAnswer);
        // 1. validate data
        System.out.println("data has been validated!");
        // 2. save data
        System.out.println("data has been saved!");
        // 3. send answer!
        System.out.println("send answer is done!");
        return "greeting";
    }
}
