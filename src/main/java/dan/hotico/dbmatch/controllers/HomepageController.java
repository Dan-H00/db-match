package dan.hotico.dbmatch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomepageController {

    @RequestMapping("/")
    public String homepage() {
        return "home";
    }

    @PostMapping("/radioResults")
    @ResponseBody
    public Map<String, String> processSelection(@RequestParam("natureResponse") String natureResponse,
                                                @RequestParam("dataRequirementsResponse") String dataRequirementsResponse,
                                                @RequestParam("performanceRequirementsResponse") String performanceRequirementsResponse,
                                                @RequestParam("budgetRequirementsResponse") String budgetRequirementsResponse,
                                                @RequestParam("experienceRequirementsResponse") String experienceRequirementsResponse,
                                                @RequestParam("integrationRequirementsResponse") String integrationRequirementsResponse,
                                                @RequestParam("securityRequirementsResponse") String securityRequirementsResponse) {
        Map<String, String> response = new HashMap<>();
        response.put("natureResponse", natureResponse);
        response.put("dataRequirementsResponse", dataRequirementsResponse);
        response.put("performanceRequirementsResponse", performanceRequirementsResponse);
        response.put("budgetRequirementsResponse", budgetRequirementsResponse);
        response.put("experienceRequirementsResponse", experienceRequirementsResponse);
        response.put("integrationRequirementsResponse", integrationRequirementsResponse);
        response.put("securityRequirementsResponse", securityRequirementsResponse);

        return response;
    }
}
