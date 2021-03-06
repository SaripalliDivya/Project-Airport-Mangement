package com.dao;

import java.util.List;

import com.model.Manager;

public interface ManagerDao {
	public List<Manager> getAllManagers();
	
	public boolean addManager(Manager manager);

	public boolean allotPilotToPlane(int pilotId, int planeId);

	public boolean allotHangarToPlane(int hangarId, int planeId);

}
