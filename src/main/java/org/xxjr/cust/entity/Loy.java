package org.xxjr.cust.entity;

import lombok.Data;

@Data
public class Loy {
	private int id; // 主键
	private int customerId; // 用户Id
	private String name; // 用户名
}
