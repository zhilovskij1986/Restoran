package com.vitalijzhilovskiy.controllers;

import com.vitalijzhilovskiy.models.ProductModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/product")
public class ProductController {
    @RequestMapping(method = RequestMethod.GET)
    public String index (ModelMap modelMap){
        ProductModel productModel = new ProductModel();
        modelMap.put("products", productModel.findAll());
        return "product/index";
    }
    
}
