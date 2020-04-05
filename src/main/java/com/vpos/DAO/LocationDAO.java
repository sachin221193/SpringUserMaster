package com.vpos.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.vpos.model.Location;

@Repository
public interface LocationDAO extends MongoRepository<Location, String>{

}
