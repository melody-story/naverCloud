package melody.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public Message hello(){
		Message message = new Message("hello-world");
		return message;
	}
}
