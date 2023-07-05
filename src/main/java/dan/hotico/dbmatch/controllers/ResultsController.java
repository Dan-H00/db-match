package dan.hotico.dbmatch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ResultsController {

    @RequestMapping("/results")
    @ResponseBody
    public String results() {
        return "results";
    }
}
