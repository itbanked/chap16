package com.example;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.GuestbookMessage;
import com.example.mapper.GuestbookMessageMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuestbookMessageMapperTests {
	
	@Autowired
	GuestbookMessageMapper mapper;

	@Test
	public void test01_confirmMapper(){
		System.out.println("mapper = " + mapper);
	}
	
	@Test
	public void test01_selectAll(){
		List<GuestbookMessage> list = mapper.selectAll();
		
		for(GuestbookMessage guestbookMessage : list)
			System.out.println(guestbookMessage);
		
		
	}
	@Test
	public void test02_selectByDeptno(){
		
	}
	@Test
	public void test03_insert(){
		
	}
	@Test
	public void test04_updateByDeptno(){
		
	}
	@Test
	public void test05_deleteByDeptno(){
		
	}
}
