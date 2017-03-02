package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Country;


@Mapper
public interface CountryMapper {
	
	@Select("select * from country")
	List<Country> selectAll();
	
	//1:n 매핑 (Xml에서)
	List<Country> selectAllWithCity();
	
	@Select("select * from country where code=#{code}")
	Country selectByCode(String code);
	
	
//	@Insert("insert into dept values (#{deptno},#{dname},#{loc})")
//	int insert(Dept dept);
//	
//	@Update("update dept set dname=#{dname}, loc=#{loc} where deptno=#{deptno}")
//	int updateByDeptno(Dept dept);
//	
//	@Delete("delete from dept where deptno=#{deptno}")
//	int deleteByDeptno(int deptno);
	
}
