package com.revatech.Controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.revatech.DAO.patientDAO;
import com.revatech.Model.Patient;

@Controller
public class PatientController {
	
	@Autowired
	patientDAO patientdao;

	@RequestMapping("/")
	public String getpatient(Model model)
	{
		List<Patient> plist=patientdao.getPatientList();
		System.out.println(plist);
		model.addAttribute( "patientList", plist);
		return "index";
		
	}
	
	@RequestMapping("/addpatient")
	public String addPatient()
	{
		System.out.println("Add patient successfully");
		return "addpatient";
		
	}
	
	@RequestMapping(value ="/handlepatient", method=RequestMethod.POST)
	public RedirectView handlepatient(@ModelAttribute  Patient patient ,HttpServletRequest request)
	{
		System.out.println(patient);
		
		 int res=patientdao.addpatient(patient);
		 RedirectView rv= new RedirectView();
		 rv.setUrl(request.getContextPath());
		 System.out.println(res);
		return rv;
		
	}
	
	@RequestMapping(value="/deletepatient/{id}")
	public RedirectView deletepatient(@ModelAttribute @PathVariable int id ,HttpServletRequest request)
	{
		System.out.println("delete patient");
		int res=patientdao.deletepatient(id);
		System.out.println("id:"+id);
		System.out.println(request.getContextPath());
		RedirectView rv=new RedirectView();
		rv.setUrl(request.getContextPath());
		System.out.println(res);
		return rv;
		
	}
	
	 @RequestMapping(value="/updatepatient/{id}")
     public ModelAndView updatepatient(@PathVariable int id)
     {
		Patient patient= patientdao.getpatient(id);
		System.out.println(patient);
    	 System.out.println("update patient");
    	 
    	 ModelAndView mv=new ModelAndView();
    	 mv.addObject("patientinfo", patient);
    	 mv.setViewName("updatepatient");
    	 
		 return mv;
    	 
     }
	  
		@RequestMapping(value ="/handleupdatepatient", method=RequestMethod.POST)
		public RedirectView handleupdatepatient(@ModelAttribute  Patient patient ,HttpServletRequest request)
		{
			System.out.println(patient);
			
			 int res=patientdao.updatepatient(patient);
			 RedirectView rv= new RedirectView();
			 rv.setUrl(request.getContextPath());
			 System.out.println(res);
			return rv;
			
		}
	
}
