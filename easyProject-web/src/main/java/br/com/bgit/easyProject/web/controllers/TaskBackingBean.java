package br.com.bgit.easyProject.web.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.bgit.easyProject.services.UserServices;
import br.com.bgit.easyProject.web.model.UserTO;

@Component("taskBB")
@Scope("request")
public class TaskBackingBean {

	private static final Logger logger = LoggerFactory.getLogger(TaskBackingBean.class);

	private UserTO user = new UserTO();
	private List<UserTO> users;

	@Autowired
	private UserServices userServices;

	
	public void find() {
		userServices.list();
	}



}
