package com.tts.WeatherApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long>{

    ZipCode findByZipCode(String zipCode);
    
    List<ZipCode>findByZipCode(String zipCode, Pageable pageable);


}
