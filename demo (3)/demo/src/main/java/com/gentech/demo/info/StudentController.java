package com.gentech.demo.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    @GetMapping("/getnames/{fn}")
    public String getname(@PathVariable String fn) {
        return "my first name is " + fn;
    }

    @GetMapping("/getloc/{loc}")
    public String getplacename(@PathVariable String loc) {
        return "my first name is " + loc;
    }

    @GetMapping("/getnames/{num1}/{num2}")
    public String getlargest(@PathVariable("num1") Integer number1, @PathVariable("num2") Integer number2) {
        if (number1 > number2) {
            return number1 + " is greater than " + number2;
        } else {
            return number2 + " is greater than " + number1;
        }
    }

    @GetMapping("/getprimenumber/{number}")
    public String primenumbers(@PathVariable Integer number) {
        int count = 0;
        if (number <= 1) {
            return "not a prime number";
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "not a prime number";
            }
        }
        return "prime number";

    }

    @GetMapping("/countdigits/{num}")
    public String countdigits(@PathVariable("num") Integer number) {
        Integer num = 0;
        Integer count = 0;
        while (number != 0) {
            num = num * 10 + num % 10;
            number /= 10;
            count++;
        }
        return "number of digits are " + count;
    }

    @GetMapping("/getpalindrome/{num}")
    public String palindrome(@PathVariable("num") Integer number) {
        Integer num = number;
            Integer original = number;
            Integer reverse = 0;
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;
            }
        if (original.equals(reverse)) {
            return "given number "+num+" is palindrome";
        }
        else {
            return "given number " + num + " is not a palindrome";
        }
    }










}
