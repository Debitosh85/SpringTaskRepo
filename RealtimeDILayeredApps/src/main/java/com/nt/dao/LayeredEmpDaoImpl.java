package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository
public class LayeredEmpDaoImpl implements LayeredIEMPDao {
	
	public static final String Get_Emp_DESG="Select * From Emp where JOB IN(?,?,?)Order by JOB";
	
	//for pooled Connection(have ready made Connection Object HikariCP comes through autoConfiguration)
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> showEmployeebyDesg(String desg1, String desg2,String desg3) throws Exception {
		
		List<Employee> empl = null;
		
		try(Connection con=ds.getConnection()){
			
			PreparedStatement ps = con.prepareStatement(Get_Emp_DESG);
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs = ps.executeQuery()){	
				
				empl = new ArrayList<Employee>();
				
				while(rs.next())
				{
					Employee emp = new Employee();
					emp.setEid(rs.getInt(1));
					emp.setEName(rs.getString(2));
					emp.setSal(rs.getDouble(3));
					emp.setJob(rs.getString(4));
					
					empl.add(emp);
				}
			}catch(Exception e) {
				//Exception Rethown
				throw e;
			}
		}catch(SQLException se) {
			
			throw se;
		}
		catch(Exception e) {
			
			throw e;
		}
		return empl;
	}
}
