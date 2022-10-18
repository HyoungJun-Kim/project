package com.goott.service;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
@ContextConfiguration(locations =  "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
public class ProductServiceTest {
	
	@Inject
	ProductServiceImpl productServiceImpl;
	
	@Test
	public void deleteImg() {
		log.info("이미지 삭제 테스트--------------------------------");
		
		productServiceImpl.deleteImg("2022/09/13/02c69c8e-f67f-417d-b2f2-c8f1660117cc.png");
	}

}
