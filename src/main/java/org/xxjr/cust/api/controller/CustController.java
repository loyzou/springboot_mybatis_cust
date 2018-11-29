package org.xxjr.cust.api.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xxjr.common.context.AppParam;
import org.xxjr.common.context.AppResult;
import org.xxjr.common.session.RequestUtil;
import org.xxjr.cust.BaseController;
import org.xxjr.cust.service.LoyService;
@RestController
@RequestMapping("/account/cust/")
@Slf4j
public class CustController extends BaseController {
	@Autowired
	private LoyService loyService;
	
	
	/***
	 * 添加用户信息
	 * @param customerId
	 * @return
	 */
	@RequestMapping("addCustInfo")
	public AppResult addCustInfo(){
		AppResult result = new AppResult();
		try{
			AppParam userParam = new AppParam();
			RequestUtil.setAttr(userParam, request);
			result = loyService.addCustInfo(userParam);
		}catch(Exception e){
			log.error("addCustInfo error",e);
		}
		return result;
	}

	
	/***
	 * 根据用户Id查询用户信息
	 * @param customerId
	 * @return
	 */
	@RequestMapping("queryCustInfo")
	public AppResult queryCustInfo(int customerId){
		AppResult result = new AppResult();
		result = loyService.queryCustInfo(customerId);
		return result;
	}

	/***
	 * 根据用户列表
	 * @param customerId
	 * @return
	 */
	@RequestMapping("queryCustList")
	public AppResult queryCustList(){
		AppResult result = new AppResult();
		try{
			AppParam queryParam = new AppParam();
			RequestUtil.setAttr(queryParam, request);
			result = loyService.queryCustList(queryParam);	
		}catch(Exception e){
			log.error("queryCustList error" ,e);
		}
		return result;
	}	
	
	/***
	 * 根据用户列表
	 * @param customerId
	 * @return
	 */
	@RequestMapping("queryCustListByPage")
	public AppResult queryCustListByPage(){
		AppResult result = new AppResult();
		try{
			AppParam queryParam = new AppParam();
			RequestUtil.setAttr(queryParam, request);
			result = loyService.queryCustListByPage(queryParam);	
		}catch(Exception e){
			log.error("queryCustListByPage error", e);
		}
		return result;
	}
}
