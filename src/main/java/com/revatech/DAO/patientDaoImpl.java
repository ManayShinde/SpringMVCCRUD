package com.revatech.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import com.revatech.Model.Patient;

//@Repository
public class patientDaoImpl implements patientDAO {

	public JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Patient> getPatientList() {
		String sql = "select * from patientinfo";

		List<Patient> res = jdbcTemplate.query(sql, new RowMapper<Patient>() {

			@Override
			public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {

				Patient patient = new Patient();
				patient.setPid(rs.getInt(1));
				patient.setName(rs.getString(2));
				patient.setLname(rs.getString(3));
				patient.setMob(rs.getLong(4));
				patient.setEmail(rs.getString(5));
				patient.setAddress(rs.getString(6));

				return patient;

			}
		});

		System.out.println("retrive suseesfully");
		return res;

	}

	@Override
	public int addpatient(Patient patient) {
		String sql = "insert into patientinfo values(?,?,?,?,?,?)";
		int res = jdbcTemplate.update(sql, patient.getPid(), patient.getName(), patient.getLname(), patient.getMob(),
				patient.getEmail(), patient.getAddress());
		return res;
	}

	@Override
	public int deletepatient(int id) {
		String sql = "delete from patientinfo where id=?";
		int res = jdbcTemplate.update(sql, id);
		return res;
	}

	@Override
	public Patient getpatient(int id) {
		String sql = "select * from patientinfo where id=?";

		Patient res = jdbcTemplate.queryForObject(sql, new RowMapper<Patient>() {

			@Override
			public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
				Patient patient = new Patient();
				patient.setPid(rs.getInt(1));
				patient.setName(rs.getString(2));
				patient.setLname(rs.getString(3));
				patient.setMob(rs.getLong(4));
				patient.setEmail(rs.getString(5));
				patient.setAddress(rs.getString(6));

				return patient;
			}

		}, id);
		return res;
	}

	@Override
	public int updatepatient(Patient patient) {
		String sql = "update patientinfo set name=?,lname=?,mob=?,email=?,address=? where id=?";
		int res = jdbcTemplate.update(sql, patient.getName(), patient.getLname(), patient.getMob(), patient.getEmail(),
				patient.getAddress(), patient.getPid());
		return res;
	}
}
