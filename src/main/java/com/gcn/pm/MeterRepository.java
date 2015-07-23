package com.gcn.pm;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MeterRepository extends CrudRepository<Meter, Integer> {

	//List<Meter> findByMeterArchived(@Param("archivedfalse") int taskArchivedFalse);

	//List<Meter> findByMeterStatus(@Param("status") String taskStatus);

}
