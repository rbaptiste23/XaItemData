package com.cwd.xadata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cwd.xadata.entities.ItemRevision;

 

@Service
public interface ItemRevisionService {

	List<ItemRevision> getItems();
}
