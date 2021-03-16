package design.boilerplate.springboot.repository;

import design.boilerplate.springboot.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, String> {
}
