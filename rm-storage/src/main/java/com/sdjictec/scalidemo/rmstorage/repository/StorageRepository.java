package com.sdjictec.scalidemo.rmstorage.repository;

import com.sdjictec.scalidemo.rmstorage.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<Storage,Integer> {
}
