package com.example.exam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @GetMapping ("/calc")
    public String inchConverter(String entry)
    {
        try{
            double inch = Double.valueOf(entry);
            return String.valueOf(inch * 2.54);
        }catch (Exception e){
            return "error";
        }

    }

}
