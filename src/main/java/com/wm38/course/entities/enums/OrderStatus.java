package com.wm38.course.entities.enums;

public enum OrderStatus {

	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	SHIPPED(3),
	ENVIADO(4),
	CANCELADO(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
		
	}
	
	
	
	
}
