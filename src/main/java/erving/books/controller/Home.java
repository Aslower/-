package erving.books.controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class Home {
 
    @RequestMapping("/")
    public String home(){
        return "你好，欢迎使用Visual Studio Code!ddddssjaflkdjflk";
    }
}