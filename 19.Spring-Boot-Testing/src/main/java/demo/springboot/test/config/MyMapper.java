package demo.springboot.test.config;

import org.apache.ibatis.annotations.Mapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MyMapper<T> extends BaseMapper<T>, MySqlMapper<T> {
	
}
