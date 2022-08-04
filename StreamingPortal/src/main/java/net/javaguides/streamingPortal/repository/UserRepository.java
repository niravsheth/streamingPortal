package net.javaguides.streamingPortal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.streamingPortal.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
}
