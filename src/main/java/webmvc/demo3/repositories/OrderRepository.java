package webmvc.demo3.repositories;

import org.springframework.data.repository.CrudRepository;
import webmvc.demo3.entity.Orders;

/**
 * Created by tuananh on 06/12/17.
 */
public interface OrderRepository extends CrudRepository<Orders, Integer> {
}
