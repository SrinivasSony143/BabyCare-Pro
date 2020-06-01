package com.example.demo.AddBabyName;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Bean.BabyBean;

@Controller
public class AddBabyNameController {

	@Autowired
	BabyServiceInter bs;
	@Autowired
	HttpSession session;

	@RequestMapping("/")
	public ModelAndView indexpage() {

		return new ModelAndView("Home");

	}

	@RequestMapping("/home")
	public ModelAndView homepage() {

		return new ModelAndView("Home");

	}

	@RequestMapping("/food")
	public ModelAndView babyfood() {

		return new ModelAndView("BabyFood");

	}

	@RequestMapping("/product")
	public ModelAndView babyproduct() {

		return new ModelAndView("BabyProduct");

	}

	@RequestMapping("/tips")
	public ModelAndView babytips() {

		return new ModelAndView("BabyTips");

	}

	@RequestMapping("/viewbyreligion")
	public ModelAndView viewbabynamesbyreligion() {

		return new ModelAndView("ViewBabyNamesByReligion");

	}

	
	  @RequestMapping(value="/hindureligion/{religion}", produces =
	  "application/json")
	  
	  @ResponseBody public org.springframework.http.ResponseEntity<List<BabyBean>>
	  hindureligion(@PathVariable("religion") String religion,BabyBean bb) {
	  
	  
	  
	  List<BabyBean> list = bs.hindureligion(bb,religion);
	  
	  
	  return new org.springframework.http.ResponseEntity<List<BabyBean>>(list,
	  HttpStatus.OK);
	  
	  }
	  
	  @RequestMapping(value="/muslimreligion/{religion}", produces =
	  "application/json")
	  
	  @ResponseBody public org.springframework.http.ResponseEntity<List<BabyBean>>
	  muslimreligion(@PathVariable("religion") String religion,BabyBean bb) {
	  
	 
	  
	  List<BabyBean> list = bs.muslimreligion(bb,religion);
	  
	  
	  return new org.springframework.http.ResponseEntity<List<BabyBean>>(list,
	  HttpStatus.OK);
	  
	  }
	 

	  @RequestMapping(value="/sikhreligion/{religion}", produces =
			  "application/json")
			  
			  @ResponseBody public org.springframework.http.ResponseEntity<List<BabyBean>>
	  sikhreligion(@PathVariable("religion") String religion,BabyBean bb) {
			  
			 
			  
			  List<BabyBean> list = bs.sikhreligion(bb,religion);
			  
			  
			  return new org.springframework.http.ResponseEntity<List<BabyBean>>(list,
			  HttpStatus.OK);
			  
			  }
			 
	  @RequestMapping(value="/christianreligion/{religion}", produces =
			  "application/json")
			  
			  @ResponseBody public org.springframework.http.ResponseEntity<List<BabyBean>>
	  christianreligion(@PathVariable("religion") String religion,BabyBean bb) {
			  
			 
			  
			  List<BabyBean> list = bs.christianreligion(bb,religion);
			  
			  
			  return new org.springframework.http.ResponseEntity<List<BabyBean>>(list,
			  HttpStatus.OK);
			  
			  }
	  
}
