package org.xxjr.cust.service;

import org.springframework.stereotype.Service;
import org.xxjr.common.context.AppParam;
import org.xxjr.common.context.AppResult;

@Service
public interface LoyService {
	
	/***
	 * 添加用户信息
	 * @param customerId
	 * @return
	 */
	public AppResult addCustInfo(AppParam params);
	
	/***
	 * 查询用户信息
	 * @param customerId
	 * @return
	 */
	public AppResult queryCustInfo(int customerId);
	
	/***
	 * 查询用户列表
	 * @param customerId
	 * @return
	 */
	public AppResult queryCustList(AppParam params);
	
	/***
	 * 分页查询用户列表
	 * @param params
	 * @return
	 */
	public AppResult queryCustListByPage(AppParam params);

}
