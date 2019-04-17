package com.cwd.xadata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwd.xadata.entities.ItemRevision;
import com.cwd.xadata.repositories.ItemRevisionRepository;

 
@Service
public class ItemRevisionServiceImpl implements ItemRevisionService {

	@Autowired
	ItemRevisionRepository itemRevisionRepository;
	
	@Override
	public List<ItemRevision> getItems() {
		List<ItemRevision> irList = itemRevisionRepository.findAll();
		return irList;
	}

}
