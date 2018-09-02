package etech.logging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import etech.logging.core.AuditTrail;

@Repository
public interface AuditTrailRepository extends JpaRepository<AuditTrail, Integer> {

}
