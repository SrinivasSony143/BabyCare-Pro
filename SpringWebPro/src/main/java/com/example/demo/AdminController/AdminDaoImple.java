package com.example.demo.AdminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Bean.BabyBean;

@Repository
public class AdminDaoImple implements AdminDaoInter {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int Addbabyname(String name, String meaning, String sex, String religion) {

		return jdbcTemplate.update("insert into babynames(name,meaning,sex,religion) values('" + name + "','" + meaning
				+ "','" + sex + "','" + religion + "')");

	}

	public List<BabyBean> babydetails(BabyBean bb) {

		return jdbcTemplate.query("select id,name,meaning,sex,religion from babynames",

				(rs, rownum) -> (new BabyBean(rs.getInt("id"), rs.getString("name"), rs.getString("meaning"),
						rs.getString("sex"), rs.getString("religion")

				))

		);

	}

	public int deletebaby(BabyBean bb, int id) {

		return jdbcTemplate.update("delete from babynames where id='"+id+"'");
	}

}
