package com.mg.maumgagym.sample.service;

import com.mg.maumgagym.sample.mapper.SampleMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Autowired
	private SampleMapper sampleMapper;

	// ์ํ ์กฐํ
	public String selectTest() {
		return sampleMapper.selectTest();
	}
}
