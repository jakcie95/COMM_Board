package com.toyproject.comm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toyproject.comm.mybatis.BoardMapper;

@Service
public class BoardServiceImpl {
@Autowired
BoardMapper bm;
}
