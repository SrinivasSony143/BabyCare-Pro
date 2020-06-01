package com.example.demo.AddBabyName;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.Bean.BabyBean;
@Controller
public class BabyServiceImpl implements BabyServiceInter{

	@Autowired
	BabyDaoInter bd;

	public List<BabyBean> hindureligion(BabyBean bb,String religion) {
		
		return bd.hindureligion(bb,religion);
	}

	
	public List<BabyBean> muslimreligion(BabyBean bb, String religion) {
		
		return bd.muslimreligion(bb,religion);
	}



	public List<BabyBean> sikhreligion(BabyBean bb, String religion) {
		
		return bd.sikhreligion(bb,religion);
	}



	public List<BabyBean> christianreligion(BabyBean bb, String religion) {
		return bd.christianreligion(bb,religion);
	}

}
