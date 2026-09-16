package com.enterprice.appMart.repository;

import com.enterprice.appMart.model.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentModel,Long> {
}
