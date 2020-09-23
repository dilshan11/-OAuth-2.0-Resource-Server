package com.example.securityResourcDemo1.Controller;

import com.example.securityResourcDemo1.Dao.ItemDao;
import com.example.securityResourcDemo1.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    //getAllItems
    //getItem
    //addItem
    //updateItem
    //deleteItem

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<ItemDao> getAllItems(){
        return this.getAllItems();
    }

    @GetMapping("/items/{id}")
    public ItemDao getItem(@PathVariable int id){
        return this.itemService.getItem(id);
    }

    @PostMapping("/items")
    @PreAuthorize("hasRole('admin')")
    public void addItem(@RequestBody ItemDao itemDao){
        this.itemService.addItem(itemDao);
    }

    @PutMapping("/items")
    @PreAuthorize("hasRole('admin')")
    public void updateItem(@RequestBody ItemDao itemDao){
        this.itemService.updateItem(itemDao);
    }

    @DeleteMapping("/items/{id}")
    @PreAuthorize("hasRole('admin')")
    public void deleteItem(int id){
        this.itemService.deleteItem(id);
    }
}
