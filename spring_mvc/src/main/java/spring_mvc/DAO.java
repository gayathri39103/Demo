package spring_mvc;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class DAO {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	

	public List<Student> getAllStudents() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setArea_of_interest(rs.getString("area of interest"));
            return student;
        });
    }
	

}



