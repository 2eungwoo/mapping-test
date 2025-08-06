package com.back2basics.mappingtest;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Disabled;

@SpringBootTest
@Transactional
class MappingTest {

    @PersistenceContext
    EntityManager em;

    @Test
    @Disabled
    void oneToManyTest() {
        Order order = new Order();
        em.persist(order); // 1-side 먼저 저장

        OrderItem orderItem = new OrderItem();
        // order.getItems().add(orderItem); // 잘못된 매핑 엔티티 코드 주석으로 인해 해당 코드도 주석

        em.persist(orderItem);

        em.flush();
    }

    @Test
    void ManyToOneTest() {
        Order order = new Order();
        em.persist(order);

        OrderItem orderItem = new OrderItem();
        em.persist(orderItem);
    }
}
