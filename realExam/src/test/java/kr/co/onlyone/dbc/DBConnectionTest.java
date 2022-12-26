package kr.co.onlyone.dbc;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariDataSource;

import kr.co.onlyone.dao.SampleDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DBConnectionTest {

	@Autowired
	ApplicationContext context;
	
	@Autowired
	HikariDataSource dataSource;
	
	/*
	 * @Autowired JdbcTemplate template;
	 */
	@Autowired
	SqlSession session;
	
	@Autowired
	SampleDao dao;
	
	@Test
	@Ignore
	public void ApplicationTest() {
		assertNotNull(context);
	}
	
	@Test
	@Ignore
	public void DBConnectionTest() {
		assertNotNull(dataSource);
	}
	
	@Test
	@Ignore
	public void getTimeJdbcTest() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement("select sysdate nowTime from dual");
			rs = ps.executeQuery();
		
			rs.next();
			System.out.println(rs.getString("nowTime"));
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close(); 
				ps.close();	
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	/*	
	 * @Test
	   public void jdbcDataSourceTest() {
	      ResultSet rs = null;
	      try {
	         rs = dataSource.getConnection().prepareCall("select sysdate from dual").executeQuery();
	         assertNotNull(rs);
	         rs.next();
	            System.out.println(rs.getString(1));         
	      }catch (SQLException e) {   
	      }finally {
	         try {rs.close();} catch (SQLException e) {}
	      }
	   }
	
		 * @Test public void jdbctemplateTest() { assertNotNull(context); String result
		 * = template.queryForObject("select sysdate from dual", String.class);
		 * assertNotNull(result); System.out.println(result); }
		 */

	
	@Test
	@Ignore
	public void SqlSessionTest() {
		  assertNotNull(session);
	}
	@Test
	public void sampleDaoTest() {
		  assertNotNull(dao);
		  String result = dao.getTime();
		  assertNotNull(result);
		  System.out.println("======="+result);
	}
	
}
