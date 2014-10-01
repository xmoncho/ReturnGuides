package com.ferromex.returnGuides.daos;

import java.util.List;
import javax.sql.DataSource;
import com.ferromex.returnGuides.beans.ReleasedCar;
import com.ferromex.returnGuides.beans.StationImpl;

public interface ReleasedCarDAO {

	public void setDatasource(DataSource value);
	
	public List<ReleasedCar> getList();
	
	public StationImpl getById(String id);
	
	public StationImpl getByName(String name,String state);
}
