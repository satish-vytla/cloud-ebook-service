package com.satish.cloudebookservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.satish.cloudebookservice.objects.PersonalInfoItem;
import com.satish.cloudebookservice.service.PersonalInfoService;

@RestController
public class EndPointRestController {
	@Autowired
	private PersonalInfoService personalInfoService;
	
	@RequestMapping(method = RequestMethod.POST, value =  "/add")
public HttpStatus saveInfo( @RequestBody PersonalInfoItem item)	{
		
	return personalInfoService.savePersonalInfo(item);
		
	}

}
