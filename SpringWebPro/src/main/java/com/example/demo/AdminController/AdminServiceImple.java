package com.example.demo.AdminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.Bean.BabyBean;
@Controller
public class AdminServiceImple implements AdminServiceInter{

	@Autowired
	AdminDaoInter ad;
	
	public int Addbabyname(String name, String meaning, String sex, String religion) {
		return ad.Addbabyname(name,meaning,sex,religion);
	
		
	}


	public List<BabyBean> babydetails(BabyBean bb) {
		
		return ad.babydetails(bb);
	}


	


	@Override
	public int deletebaby(BabyBean bb,int id) {
	
		return ad.deletebaby(bb,id);
	}

}
