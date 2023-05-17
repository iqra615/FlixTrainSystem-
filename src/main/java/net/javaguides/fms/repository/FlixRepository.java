package net.javaguides.fms.repository;

import net.javaguides.fms.entity.Flix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlixRepository extends JpaRepository<Flix, Long> {

}
