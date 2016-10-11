package com.bxkj.kdp.service;

import org.springframework.stereotype.Service;

import com.bxkj.kdp.persistence.domain.LngfUser;
import com.bxkj.kdp.persistence.domain.LngfUserExample;
import com.bxkj.kdp.persistence.mapper.LngfUserMapper;


@Service
public class DemoServiceImpl extends GenericServiceImpl<LngfUserExample,LngfUser,LngfUserMapper> implements DemoService {

	
}
