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
        em.persist(order);

        OrderItem orderItem = new OrderItem();
        // order.getItems().add(item); -- 단방향이지만 객체 컬렉션에 추가해줘야됨

        // 이렇게 하면 연관관계가 생기겠지만 쿼리 로그 보면 null로 들어감(order_id)
        em.persist(orderItem);
    }
}
