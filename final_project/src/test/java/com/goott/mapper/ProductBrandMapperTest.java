package com.goott.mapper;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goott.domain.ProductBrandVO;

import lombok.extern.log4j.Log4j;
@ContextConfiguration(locations =  "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
public class ProductBrandMapperTest {
	@Inject
	ProductBrandMapper productBrandMapper;

	@Test
	public void test() {
		log.info("test------------------------------------------------");
		
		for (ProductBrandVO productBrandVO : productBrandMapper.get()) {
			log.info(productBrandVO);
		}
		
	}

}
