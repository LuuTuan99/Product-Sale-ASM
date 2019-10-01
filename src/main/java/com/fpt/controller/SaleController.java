package com.fpt.controller;

import com.fpt.entity.Sale;
import com.fpt.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "sales")
public class SaleController {
    @Autowired
    SaleService saleService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("sales", saleService.getList());
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(Model model) {
        model.addAttribute("sale",new Sale());
        return "form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String store (@RequestBody Sale sale) {
        saleService.create(sale);
        return "list";
    }
}
