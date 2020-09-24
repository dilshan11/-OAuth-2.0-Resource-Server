package com.example.securityResourcDemo1.Controller;

import com.example.securityResourcDemo1.Dao.CustomerDao;
import com.example.securityResourcDemo1.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController()
//@PreAuthorize("hasRole('admin')")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

//    @RolesAllowed({"admin","user"})
//    @PreAuthorize("hasAuthority('READ')")
    @GetMapping("/customers")
    public List<CustomerDao> getAllCustomers(){
        return   this.customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
//    @PreAuthorize("hasRole('admin')")
    public CustomerDao getCustomer(@PathVariable int id){
        return this.customerService.getCustomer(id);
    }

    @PostMapping("/customers/add")
//    @RolesAllowed("admin")
//    @PreAuthorize("hasRole('user')")
    public void addCustomer(@RequestBody CustomerDao customerDao){
        System.out.println(customerDao);
        this.customerService.addCustomer(customerDao);
    }

    @PutMapping("/customers/update")
//    @RolesAllowed("admin")
//    @PreAuthorize("hasRole('user')")
    public void updateCustomer(@RequestBody CustomerDao customerDao){
        this.customerService.updateCustomer(customerDao);
    }

    @DeleteMapping("/customersdelete/{id}")
//    @Secured("admin")
//    @PreAuthorize("hasRole('user')")
    public void deleteCustomer(@PathVariable int id){
        this.customerService.deleteCustomer(id);
    }


    @PutMapping("/customers/addCustomerDetails")
//    @PreAuthorize("hasRole('user')")
    public void addDCustomerDetails(@RequestBody CustomerDao customerDao){
        this.customerService.addCustomerDetailsToCustomer(customerDao );
    }

    @PutMapping("/customers/addOrders")
    public void addOrdersToCustomers(@RequestBody CustomerDao customerDao){

        this.customerService.addOrdersToCustomers(customerDao);
    }

//    @GetMapping("/profile")
//    public @ResponseBody String getOauth2Principal(OAuth2Authentication auth) {
//        return "Access granted for " + auth.getPrincipal();
//    }

}
