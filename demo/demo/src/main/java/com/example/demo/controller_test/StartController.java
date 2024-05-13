package com.example.demo.controller_test;


//import com.example.demo.domain.Temp;
//import com.example.demo.service.TempService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

public class StartController {

//    private final TempService tempService;

 //   @Autowired
//    public StartController(TempService tempService) {
  //      this.tempService = tempService;
 //   }

    @GetMapping("/")
    public String start() {
        return "start";
    }

    @GetMapping("/temps")
    public String list(Model model) {
   //     List<Temp> temps = tempService.findTemps();
   //     model.addAttribute("temps", temps);
        return "templist";
    }

    @GetMapping("/pw")
    public String password() {
        return "password";
    }
 /*
    @PostMapping("/checkpassword")
    public String checkPassword(String password) {
        return "sampletemplate";
    }

  */
}


