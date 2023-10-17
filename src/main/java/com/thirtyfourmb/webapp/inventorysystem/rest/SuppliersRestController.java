package com.thirtyfourmb.webapp.inventorysystem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirtyfourmb.webapp.inventorysystem.entity.Suppliers;
import com.thirtyfourmb.webapp.inventorysystem.service.SupplierService;

@RestController
@RequestMapping("/api")
public class SuppliersRestController {
    private SupplierService supplierService;

    @Autowired
    public SuppliersRestController(SupplierService supplierService) {
        this.supplierService =supplierService;
    }

    @GetMapping("/suppliers")
    public List<Suppliers> findAll(){
        return supplierService.findAll();
    }

    @GetMapping("/suppliers/{supplierId}")
    public Suppliers findById(@PathVariable int supplierId) {
        return supplierService.findById(supplierId);
    }
    @PostMapping("/suppliers")
    public Suppliers addSuppliers(@RequestBody Suppliers suppliers)
    {
        suppliers.setId(0);
        return supplierService.save(suppliers);
    }

    @PutMapping("/suppliers")
    public Suppliers updateSuppliers(@RequestBody Suppliers suppliers)
    {
        return supplierService.save(suppliers);
    }

    @DeleteMapping("/suppliers/{supplierId}")
    public String deleteSuppliers(@PathVariable int supplierId) {
        supplierService.deleteById(supplierId);
        return "Suppliers " + supplierId +" has been deleted.";
    }
}
