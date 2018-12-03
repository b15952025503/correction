package com.community.demo;

import com.community.demo.dao.AuthorityManagementMapper;
import com.community.demo.entity.AuthorityManagement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorrectionApplicationTests {

	@Autowired
	AuthorityManagementMapper authorityManagementMapper;
	@Test
	public void contextLoads() {
		AuthorityManagement all = authorityManagementMapper.findAll();
		System.out.println(all);
	}

}
