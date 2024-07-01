package com.cetpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.model.Product;
import com.cetpa.service.ProductService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String getHomeView()
	{
		return "home";
	}
	@RequestMapping("insert")
	public String getInsertView()
	{
		return "insert";
	}
	@RequestMapping("save")
	public String saveProductRecord(Product pp,Model model)
	{
		Product p=service.getRecord(pp.getPid());
		if(p!=null)
		{
			model.addAttribute("msg","Product with id "+pp.getPid()+" already exists");
			return "insert";
		}
		service.saveRecord(pp);
		return "save";
	}
	@RequestMapping("list")
	public String getProductList(Model model)
	{
		List<Product> list=service.getList();
		model.addAttribute("plist",list);
		return "product-list";
	}
	@RequestMapping("search")
	public String getSearchView()
	{
		return "search";
	}
	@RequestMapping("search-record")
	public String searchProductRecord(int pid,Model model)
	{
		Product p=service.getRecord(pid);
		if(p==null)
		{
			model.addAttribute("msg","Product with id "+pid+" not found");
			return "search";
		}
		model.addAttribute("product",p);
		return "show-details";
	}
	@RequestMapping("delete")
	public String getDeleteView()
	{
		return "delete";
	}
	@RequestMapping("delete-record")
	public String deleteProductRecord(int pid,Model model)
	{
		Product p=service.deleteRecord(pid);
		if(p==null)
			model.addAttribute("msg","Product with id "+pid+" does not exist");
		else
			model.addAttribute("msg","Product with id "+pid+" has been deleted");
		return "delete";
	}
	@RequestMapping("edit")
	public String getEditView()
	{
		return "edit";
	}
	@RequestMapping("edit-record")
	public String getProductRecord(int pid,Model model)
	{
		Product p=service.getRecord(pid);
		if(p==null)
		{
			model.addAttribute("msg","Product with id "+pid+" not found");
			return "edit";
		}
		model.addAttribute("product",p);
		return "get-details";
	}
	@RequestMapping("update-record")
	public String updateProductRecord(Product pp)
	{
		service.updateRecord(pp);
		return "update";
	}
	@RequestMapping("bybrand")
	public String getByBrandView()
	{
		return "searchby-brand";
	}
	@RequestMapping("listby-brand")
	public String getListByBrand(String brand,Model model)
	{
		List<Product> list=service.getListByBrand(brand);
		if(list.isEmpty())
		{
			model.addAttribute("msg","No product of brand "+brand+" found");
			return "searchby-brand";
		}
		model.addAttribute("plist",list);
		return "listby-brand";
	}
	@RequestMapping("byname")
	public String getByNameView()
	{
		return "searchby-name";
	}
	@RequestMapping("listby-name")
	public String getListByName(String name,Model model)
	{
		List<Product> list=service.getListByName(name);
		if(list.isEmpty())
		{
			model.addAttribute("msg","No product of name "+name+" found");
			return "searchby-name";
		}
		model.addAttribute("plist",list);
		return "listby-name";
	}
}
