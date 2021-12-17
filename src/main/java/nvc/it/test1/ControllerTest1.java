package nvc.it.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ControllerTest1 {

    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "<center>This root page<br>Nantawat Deeprom<br>63309010024</center><hr><a href='/name'>GO TO Name</a>";
    }
    
    @RequestMapping("/name")
    @ResponseBody
    public String name() {
        return "<center>Nantawat Deeprom</center><hr><a href='/about'>GO TO About---></a><br><a href='/'><---BACK TO Root</a>";
    }

    @RequestMapping("/about")
    @ResponseBody
    public String about() {
        return "<center>ME</center><hr><a href='/about/me'>GO TO Me---></a><br><a href='/about/contact'>GO TO Contact---></a><br><a href='/name'><---BACK TO Name</a><br><a href='/'><---BACK TO Root</a>";
    }

    @RequestMapping("/about/me")
    @ResponseBody
    public String aboutme() {
        return "<center><p>MyName : Nantawat Deeprom<p><hr><p>NickName : JobJab</p><hr><p>Age : 20 years old</p><hr></center><a href='/about'><---BACK TO About</a>";
    }

    @RequestMapping("/about/contact")
    @ResponseBody
    public String contact() {
        return "<center><p>Tel. : 09X-XXX-XXXX</p><hr><p>Facebook : JobJab Nantawat</p><hr><p>IG : jobjab_240</p><hr></center><a href='/about'><---BACK TO About</a>";
    }
}
