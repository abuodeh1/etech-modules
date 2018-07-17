package etech.security.services;

import java.util.List;

import etech.security.core.Schedule;
import etech.security.repositories.ScheduleRepository;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:55 AM
 */

//@Service
public class ScheduleService {

	//@Autowired
	public ScheduleRepository scheduleRepository;

	/**
	 * 
	 * @param schedule
	 */
	public void delete(Schedule schedule){
		scheduleRepository.delete(schedule);
	}

	public Schedule getDefaultSchedule(){
		return scheduleRepository.findByScheduleDefault(true);
	}

	/**
	 * 
	 * @param scheduleID
	 */
	public Schedule getScheduleByScheduleID(int scheduleID){
		return scheduleRepository.findById(scheduleID).get();
	}

	/**
	 * 
	 * @param isActive
	 */
	public List<Schedule> getSchedulesByActivityStatus(boolean isActive){
		return scheduleRepository.findByScheduleActivityStatus(isActive);
	}

	/**
	 * 
	 * @param schedule
	 */
	public Schedule save(Schedule schedule){
		return scheduleRepository.save(schedule);
	}

}