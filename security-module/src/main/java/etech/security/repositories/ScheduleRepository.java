package etech.security.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import etech.security.core.Schedule;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:52 AM
 */

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

	/**
	 * 
	 * @param isActive
	 */
	public List<Schedule> findByScheduleActivityStatus(boolean isActive);

	public Schedule findByScheduleDefault(boolean isDefault);

}