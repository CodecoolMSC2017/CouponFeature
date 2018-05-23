package com.codecool.web.dao;

import com.codecool.web.model.Coupon;
import com.codecool.web.model.Shop;
import com.codecool.web.model.User;

import java.sql.SQLException;
import java.util.List;

public interface CouponDao {

    List<Coupon> findAll() throws SQLException;

    Coupon findById(int id) throws SQLException;

    List<Coupon> findByUser(User user) throws SQLException;

    List<Coupon> findCouponsByShop(User user, Shop shop) throws SQLException;

    Coupon add(String name, int percentage, User user) throws SQLException;

    void add(int couponId, int... shopIds) throws SQLException;
}
