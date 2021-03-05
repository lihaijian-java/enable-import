package top.lihaijian.enableimport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * HelloController
 *
 * @author haijian.li
 * @version 1.0
 * 2021/3/5 20:50
 **/
@RestController
public class HelloController {


    @GetMapping("hello")
    public List<String> users(){
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 2000; i++) {
            users.add("luomo"+i);
        }
        return users;
    }
}
