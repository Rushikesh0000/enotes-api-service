package com.enotes.service;

import java.util.List;

import com.enotes.dto.Categorydto;
import com.enotes.entity.Category;

public interface CategoryService 
{
	public boolean saveCategory(Categorydto category);
	
	public List<Categorydto>getAllCategory();

}
