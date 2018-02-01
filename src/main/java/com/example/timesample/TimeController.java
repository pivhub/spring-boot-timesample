package com.example.timesample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaguilar on 2/1/18.
 */
@RestController
public class TimeController {

    @RequestMapping("/")
    @ResponseBody
    public Map<String,Object> getTime() {
        Long now = System.currentTimeMillis();
        Date date = new Date(now);

        Map<String,Object> response = new HashMap<>();
        response.put("milliseconds", now);
        response.put("date", date.toString());

        return response;
    }
}
