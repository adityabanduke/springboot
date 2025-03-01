package com.example.shoppingmall.repository;

import com.example.shoppingmall.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT o FROM Order o WHERE o.timestamp >= :time")
    List<Order> findRecentOrders(@Param("time") LocalDateTime time);
}

