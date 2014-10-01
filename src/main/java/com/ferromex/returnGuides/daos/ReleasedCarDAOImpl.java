package com.ferromex.returnGuides.daos;

import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import com.ferromex.returnGuides.beans.ReleasedCar;
import com.ferromex.returnGuides.beans.StationImpl;

public class ReleasedCarDAOImpl implements ReleasedCarDAO {
	private DataSource datasource;
	private SimpleJdbcCall procedure;
	private JdbcTemplate template;

	public void setDatasource(DataSource value) {
		datasource = value;
		template = new JdbcTemplate(datasource);
		procedure =  new SimpleJdbcCall(datasource);
	}

	public List<ReleasedCar> getList() {
		ReleasedCarsSP stored = new ReleasedCarsSP(template);
		return (List<ReleasedCar>) stored.execute();
	}

	public StationImpl getById(String id) {
		procedure.withProcedureName("SP_RELEASEDCARS_STATION_BYID");
		SqlParameterSource _in = new MapSqlParameterSource().addValue("pId", id);
	    Map<String, Object> _out = procedure.execute(_in);
	    StationImpl _station = new StationImpl(id, (String)_out.get(""), (String)_out.get(""));
		return _station;
	}

	public StationImpl getByName(String name, String state) {
		procedure.withProcedureName("SP_RELEASEDCARS_STATION_BYNAME");
		SqlParameterSource _in = new MapSqlParameterSource().addValue("pId", name);
	    Map<String, Object> _out = procedure.execute(_in);
	    StationImpl _station = new StationImpl((String)_out.get(""), name, state);
		return _station;
	}
}
