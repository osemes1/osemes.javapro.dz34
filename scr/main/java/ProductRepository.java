package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

/*    // Приклад методу для отримання продукту за ідентифікатором (id)
    Product findById(Long id);

    // Приклад методу для отримання списку всіх продуктів з вказаною назвою
    List<Product> findAllByName(String name);

    // Приклад методу для отримання списку всіх продуктів, вартість яких менше заданої
    List<Product> findAllByCostLessThan(Double maxCost);

    // Приклад методу для отримання списку всіх продуктів, вартість яких більше заданої
    List<Product> findAllByCostGreaterThan(Double minCost);
*/
}
