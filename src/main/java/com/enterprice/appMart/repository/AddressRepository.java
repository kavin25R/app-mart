package com.enterprice.appMart.repository;

import com.enterprice.appMart.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<AddressModel,Long> {
}
