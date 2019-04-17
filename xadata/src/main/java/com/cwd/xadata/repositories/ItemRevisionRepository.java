package com.cwd.xadata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cwd.xadata.entities.ItemRevision;
import com.cwd.xadata.entities.ItemRevisionIdentity;

 

public interface ItemRevisionRepository extends JpaRepository<ItemRevision, ItemRevisionIdentity> {

}
