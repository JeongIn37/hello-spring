package hello.hellospring;

import hello.hellospring.domain.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	public static interface MemberRepository {
		Member save(Member member);
		Optional<Member> findById(Long id);
		Optional<Member> findByName(String name);
		List<Member> findAll();
	}
}
