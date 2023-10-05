package com.vikram.CreatingTable.controller;

import com.vikram.CreatingTable.models.Useraddress;
import com.vikram.CreatingTable.models.Userdata;
import com.vikram.CreatingTable.models.UserincomeType;
import com.vikram.CreatingTable.models.Userincome;
import com.vikram.CreatingTable.repository.Userdatarepository;
import com.vikram.CreatingTable.repository.Useraddressrepository;
import com.vikram.CreatingTable.repository.UserincomeTyperepository;
import com.vikram.CreatingTable.repository.Userincomerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private Userdatarepository repositoryConnect;

    @Autowired
    private Useraddressrepository useraddressrepository;

  @PostMapping(value ="/post")
    public ResponseEntity<String> postDataForAll(@RequestBody List<Userdata> creatingTable)
  {
      repositoryConnect.saveAll(creatingTable);
      return ResponseEntity.ok("data saved");

  }
   @GetMapping(value = "/get/{ids}")
    public ResponseEntity GetDatas(@PathVariable("ids")int ids){
       Optional<Userdata>  demo=repositoryConnect.findById(ids);
       if(demo.isPresent()){
         return   ResponseEntity.ok(demo.get());
       }
       else {
           return ResponseEntity.ok("id is not correct");
       }
   }
   @PostMapping(value = "/post2")
    public  ResponseEntity<String> postData(@RequestBody List<Useraddress> useraddress){
      useraddressrepository.saveAll(useraddress);
      return ResponseEntity.ok("data is created");
   }
   @GetMapping
    public  ResponseEntity getData(){
      return ResponseEntity.ok(useraddressrepository.findAll());
   }
    @GetMapping(value = "/getAll")
    public  ResponseEntity getDATAa(){
        return ResponseEntity.ok(repositoryConnect.findAll());
    }
   @PutMapping(value = "/{ids}")
    public ResponseEntity<Userdata> upDate(@PathVariable("ids")int ids,@RequestBody Userdata getting){
      Optional<Userdata> demo=repositoryConnect.findById(ids);
      if(demo.isPresent()){
          Userdata demo1 =demo.get();
          demo1.setName(getting.getName());
          demo1.setEmail(getting.getEmail());
          demo1.setUseraddress(getting.getUseraddress());
          return ResponseEntity.ok(repositoryConnect.save(demo1));
      }
      else {
          return null;
      }

   }
    @PutMapping(value = "/put/{ids}")
    public ResponseEntity<Useraddress> upDateAddress(@PathVariable("ids")int ids,@RequestBody Useraddress getting){
      Optional<Useraddress> aDDres= useraddressrepository.findById(ids);
      if(aDDres.isPresent()){
          Useraddress demo2=aDDres.get();
          demo2.setAddressType(getting.getAddressType());
          return ResponseEntity.ok((useraddressrepository.save(demo2)));
      }
      else {
          return null;
      }
    }
    @Autowired
    private UserincomeTyperepository userincomeTyperepository;
    @Autowired
    private Userincomerepository userincomerepository;


    @GetMapping(value = "/demo/inc")
    public  ResponseEntity<Object> grtALL() {

        return ResponseEntity.ok(userincomeTyperepository.findAll());
      }

    @PostMapping(value ="/post/inc")
    public ResponseEntity<String> postEmployData(@RequestBody List<UserincomeType> creatingTable)
    {
        userincomeTyperepository.saveAll(creatingTable);
        return ResponseEntity.ok("data saved");

    }
    @PutMapping(value = "/put/inc/{ids}")
    public ResponseEntity<Userincome> upDateIncome(@PathVariable("ids")int ids, @RequestBody Userincome getting){
        Optional<Userincome> addres = userincomerepository.findById(ids);
        if(addres.isPresent()){
            Userincome demo2=addres.get();
            demo2.setEmpIncome(getting.getEmpIncome());
            demo2.setYerIncome(getting.getYerIncome());
            return ResponseEntity.ok((userincomerepository.save(demo2)));
        }
        else {
            return null;
        }

   }
    @GetMapping(value = "/get/inc/{ids}")
    public ResponseEntity GetDatasincome(@PathVariable("ids")int ids){
        Optional<UserincomeType>  demo= userincomeTyperepository.findById(ids);
        if(demo.isPresent()){
            return   ResponseEntity.ok(demo.get());
        }
        else {
            return ResponseEntity.ok("id is not correct");
        }
    }
}
