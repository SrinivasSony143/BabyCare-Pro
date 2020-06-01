package com.example.demo.AddBabyName;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.example.demo.Bean.BabyBean;

@Controller
public interface BabyDaoInter{

public	List<BabyBean> hindureligion(BabyBean bb, String religion);

public List<BabyBean> muslimreligion(BabyBean bb, String religion);

public List<BabyBean> sikhreligion(BabyBean bb, String religion);

public List<BabyBean> christianreligion(BabyBean bb, String religion);

}
