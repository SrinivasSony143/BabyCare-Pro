package com.example.demo.AdminController;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Bean.BabyBean;

@Service
public interface AdminServiceInter {



public int Addbabyname(String name, String meaning, String sex, String religion);

public List<BabyBean> babydetails(BabyBean bb);

public int deletebaby(BabyBean bb, int id);





}
