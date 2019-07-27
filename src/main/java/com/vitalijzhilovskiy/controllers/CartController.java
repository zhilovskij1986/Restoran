package com.vitalijzhilovskiy.controllers;

import com.vitalijzhilovskiy.entities.Item;
import com.vitalijzhilovskiy.models.ProductModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/cart")

public class CartController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "cart/index";
    }

    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public String buy(@PathVariable("id") String id, HttpSession session){
        ProductModel productModel = new ProductModel();
        if (session.getAttribute("cart") ==null) {
            List<Item> cart = new ArrayList<Item>();
            cart.add(new Item(productModel.find(id), 1));
            session.setAttribute("cart", cart);
        }else {
            List<Item> cart = (List<Item>)session.getAttribute("cart");
            int index = this.exists(id, cart);
            if (index==-1){
                cart.add(new Item(productModel.find(id), 1));
            }else {
                int quantity = cart.get(index).getQuantity() + 1;
                cart.get(index).setQuantity(quantity);
            }
            session.setAttribute("cart", cart);
        }
        return "redirect:/cart/index";
    }
    @RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
    public String remove(@PathVariable("id") String id, HttpSession session){
        ProductModel productModel = new ProductModel();
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        int index = this.exists(id, cart);
        cart.remove(index);
        session.setAttribute("cart", cart);
        return "redirect:/cart/index";
}
private int exists(String id, List<Item> cart){
    for (int i = 0; i <cart.size() ; i++) {
        if (cart.get(i).getProduct().getId().equalsIgnoreCase(id)){
            return i;
        }
        
    }
    return -1;
  }
}
