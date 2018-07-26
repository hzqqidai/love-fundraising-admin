package love.fundraising;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("love.fundraising.dao")
public class LoveDataVerificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveDataVerificationApplication.class, args);
	}
}
