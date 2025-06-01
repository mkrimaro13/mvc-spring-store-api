package co.com.personal.store_api.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Order {
 private Integer id;
 private List<OrderItem> items;
 private Customer customer;
 private Integer totalPrice;
}
