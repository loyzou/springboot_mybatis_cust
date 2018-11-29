package org.xxjr.cust.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.xxjr.common.context.AppParam;
import org.xxjr.common.context.AppResult;
import org.xxjr.cust.mapper.LoyMapper;
import org.xxjr.cust.service.LoyService;

import com.github.pagehelper.PageHelper;
@Service
public class LoyServiceImpl implements LoyService {
	@Autowired
	private LoyMapper loyMapper;
	
	/***
	 * 添加用户信息
	 * @param customerId
	 * @return
	 */
	@Transactional
	public AppResult addCustInfo(AppParam param){
		int size = loyMapper.addCustInfo(param.getAttr());
		AppResult result = new AppResult();
		result.putAttr("totalSize",size);
		return result;
	}
	@Transactional(readOnly=true)
	public AppResult queryCustInfo(int customerId){	
		AppResult result = new AppResult();
		Map<String,Object> custMap = loyMapper.queryCustInfo(customerId);	
		result.addRow(custMap);
		return result;
	}
	

	@Override
	public AppResult queryCustList(AppParam params) {
		AppResult result = new AppResult();
		List<Map<String,Object>> custList = loyMapper.queryCustList(params.getAttr());
		result.setRows(custList);
		return result;
	}
	
	/***
	 * 分页查询用户列表
	 * @param customerId
	 * @return
	 */
	@Override
	public AppResult queryCustListByPage(AppParam params) {
		AppResult result = new AppResult();
		PageHelper.startPage(params.getCurrentPage(),params.getEveryPage());
		List<Map<String,Object>> custList = loyMapper.queryCustList(params.getAttr());
		result.setRows(custList);
		return result;
	}
}
