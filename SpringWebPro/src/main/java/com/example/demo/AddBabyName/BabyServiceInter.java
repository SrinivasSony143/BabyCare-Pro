package com.example.demo.AddBabyName;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Bean.BabyBean;
@Service
public interface BabyServiceInter {

public	List<BabyBean> hindureligion(BabyBean bb, String religion);

public List<BabyBean> muslimreligion(BabyBean bb, String religion);

public List<BabyBean> sikhreligion(BabyBean bb, String religion);

public List<BabyBean> christianreligion(BabyBean bb, String religion);

}
