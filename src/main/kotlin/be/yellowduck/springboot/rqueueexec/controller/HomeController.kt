package be.yellowduck.springboot.rqueueexec.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {

    @RequestMapping("/")
    fun home(model: Model): String {
        return "index.html"
    }

}