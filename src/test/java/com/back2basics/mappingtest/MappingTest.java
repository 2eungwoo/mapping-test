package com.back2basics.mappingtest;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class MappingTest {

    @PersistenceContext
    EntityManager em;

    @Test
    void oneToManyTest() {
        Order order = new Order();
        em.persist(order); // 1-side 먼저 저장

        OrderItem orderItem = new OrderItem();
        order.getItems().add(orderItem); // -- 단방향이지만 객체 컬렉션에 추가해줘야됨

        em.persist(orderItem);

        em.flush();
    }
}
