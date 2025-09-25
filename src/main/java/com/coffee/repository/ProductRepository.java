package com.coffee.repository;

import com.coffee.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // 상품의 아이디를 역순으로 정렬하여 상품 목록을 보여 주어야 합니다.
    // JpaRepository를 상속받아 여러 클래스에서 메소드 작성에 도움이 됩니다. 따라서 Repository 작성 시 상위 클래스 상속 유의할 것
    List<Product> findProductByOrderByIdDesc();
}
