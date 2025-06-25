package com.enotes.service.impl;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.enotes.dto.Categorydto;
import com.enotes.entity.Category;
import com.enotes.repository.CategoryRepository;
import com.enotes.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService
{

	private CategoryRepository categoryRepo;
	
	private final ModelMapper mapper;

	
	public CategoryServiceImpl(CategoryRepository categoryRepo,ModelMapper mapper)
	{
		this.categoryRepo=categoryRepo;
		  this.mapper = mapper;
	}
	
	
	public boolean saveCategory(Categorydto categoryDto) 
	{

//		Category category=new Category();

		
//		category.setName(categoryDto.getCategory_name());
//		category.setDescription(categoryDto.getDescription());
//		category.setActive(categoryDto.getIsactive());
		
		Category category=mapper.map(categoryDto,Category.class);
	
		category.setDeleted(false);
		category.setCreatedBy(1);
		category.setCreatedOn(new Date());
		
		Category saveCategory= categoryRepo.save(category);
		
	    if (saveCategory != null)
	    {
	        return true;
	    }

	    return false;

		
	}

	public List<Categorydto> getAllCategory()
	{
		
		List<Category>categories=categoryRepo.findAll();	
		
	    List<Categorydto> categorydoList = categories.stream().map(cat -> mapper.map(cat, Categorydto.class))
	            .toList();

	        return categorydoList;
	}

}
