package com.ferromex.returnGuides.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import oracle.jdbc.OracleTypes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.object.StoredProcedure;
import com.ferromex.returnGuides.beans.ActorImpl;
import com.ferromex.returnGuides.beans.ReleasedCar;
import com.ferromex.returnGuides.beans.StccImpl;

public class ReleasedCarsSP extends StoredProcedure {
	
	public ReleasedCarsSP(JdbcTemplate template) {
		super(template, "sp_liberacion_get_cars");
		this.declareParameter(new SqlOutParameter("C_CARS", OracleTypes.CURSOR, new RowMapper<ReleasedCar>() {
			
			public ReleasedCar mapRow(ResultSet rs, int rownum) throws SQLException {
				ReleasedCar _car = new ReleasedCar(rs.getString("INICIAL"), rs.getInt("NUMERO"));
				_car.setFolio(rs.getInt("FOLIO"));
				_car.setId(rs.getInt("ID"));
				_car.setStcc(new StccImpl(rs.getString("CONTENIDO")));
				_car.setlocated(rs.getDate("SITUADO"));
				_car.setReleased(rs.getDate("LIBERADO"));
				ActorImpl _agent = new ActorImpl(rs.getString("AGENTE"));
				_agent.setAddress("AGENTE_DIRECCION");
				_agent.setCity("AGENTE_CIUDAD");
				_agent.setState("AGENTE_EDO");
				_agent.setTel("AGENTE_TEL");
				_car.setAgent(_agent);
				return _car;
			}			
		}));
		this.compile();
	}
	
    public Object execute() {
    	Map<String, Object> results = super.execute(new HashMap<String, Object>());
    	return results.get("C_CARS");
    }
}
