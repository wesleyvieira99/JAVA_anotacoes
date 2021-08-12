package entities.enums;

public enum OrderStatus {
	PENDING_PAYMENT,
	PROCESSING,
	SHIPPED,
	DELIVERED;
}

//////////////////////////////////////////////////////////////////////////////////////////

package entities;
import java.util.Date;
//Importação do Date.
import entities.enums.OrderStatus
//Importação do enum que eu criei 
import java.time.Instant;
//Importação do Instant.

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus status; // atributo "status" do tipo enumerate "OrderStatus".
	
	public Order() {
	}

	public Order(Integer id, Date moment, OrderStatus status) {  //Construtor
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}

//////////////////////////////////////////////////////////////////////////////////////////

package application;

import entities.Order;
//importar a classe Order do pacote entities
import entities.enums.OrderStatus;
//Para importar o enumarete do meu subpacote enum do meu pacote entities
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		// nova classe Order com o parâmetros de id 1080, momento de agora e  status da lista enumerate que eu criei
		
		//Como converter de String para Enum:
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
	}
}