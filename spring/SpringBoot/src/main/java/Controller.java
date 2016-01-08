import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by HSH on 2016. 1. 8..
 */
@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @RequestMapping
    public @ResponseBody String index(){
        return "Hello world";
    }
}
