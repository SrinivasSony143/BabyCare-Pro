package com.example.demo.AddBabyName;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Bean.BabyBean;

@Repository
public class BabyDaoImpl implements BabyDaoInter{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<BabyBean> hindureligion(BabyBean bb, String religion) {
		return jdbcTemplate.query("select id,name,meaning,sex,religion from babynames where religion='hindu'",

				(rs, rownum) -> (new BabyBean(rs.getInt("id"), rs.getString("name"), rs.getString("meaning"),
						rs.getString("sex"), rs.getString("religion")

				))

		);

	}


	
	public List<BabyBean> muslimreligion(BabyBean bb, String religion) {
		return jdbcTemplate.query("select id,name,meaning,sex,religion from babynames where religion='muslim'",

				(rs, rownum) -> (new BabyBean(rs.getInt("id"), rs.getString("name"), rs.getString("meaning"),
						rs.getString("sex"), rs.getString("religion")

				))

		);
	}




	public List<BabyBean> sikhreligion(BabyBean bb, String religion) {
		return jdbcTemplate.query("select id,name,meaning,sex,religion from babynames where religion='sikh'",

				(rs, rownum) -> (new BabyBean(rs.getInt("id"), rs.getString("name"), rs.getString("meaning"),
						rs.getString("sex"), rs.getString("religion")

				))

		);
	}



	@Override
	public List<BabyBean> christianreligion(BabyBean bb, String religion) {
		return jdbcTemplate.query("select id,name,meaning,sex,religion from babynames where religion='christian'",

				(rs, rownum) -> (new BabyBean(rs.getInt("id"), rs.getString("name"), rs.getString("meaning"),
						rs.getString("sex"), rs.getString("religion")

				))

		);
	}

}
