package in.ashokit;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		int i = 30;
		int j = 40;
		int sum = i + j;
		System.out.println("Sum: " + sum);
		return application.sources(SbRestAppApplication.class);
	}

}
