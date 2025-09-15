package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Binding.ActorData;
import com.nt.service.ActorInfoManagementServiceImpl;
@RestController
@RequestMapping("/actor-api")
public class ActorOperationsController {

	@Autowired
	private ActorInfoManagementServiceImpl ActorService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveActor(@RequestBody ActorData data)
	{
	
		//use service
		String msg=ActorService.registerActorInfo(data);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<ActorData>> showAllDoctors()
	{
		//use service
		List<ActorData> listData=ActorService.showAllActors();
	   return new ResponseEntity<List<ActorData>>(listData,HttpStatus.OK);
	   
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<ActorData> fetchActorById(@PathVariable Integer id) 
	{
		//use service
		ActorData data=ActorService.showActorById(id);
		return new ResponseEntity<ActorData>(data,HttpStatus.OK);
		
	}
	@PutMapping("/update")
	public  ResponseEntity<String>    updateActorData(@RequestBody  ActorData  data){
		//use service
		String  msg=ActorService.updateActorData(data);
		return  new  ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@PatchMapping("/rupdate/{id}/{amount}")
	public   ResponseEntity<String>    updateActorRemuneration(@PathVariable  Integer id,@PathVariable double  amount){
		//use service
		String msg=ActorService.updateActorRemuneration(id, amount);
		return  new  ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	@PatchMapping("/supdate/{id}/{status}")
	public   ResponseEntity<String>    updateActorStatus(@PathVariable  Integer id,@PathVariable String  status){
		//use service
		String msg=ActorService.updateActorStatus(id,status);
		return  new  ResponseEntity<String>(msg,HttpStatus.OK);
		}
	
	
	@DeleteMapping("/delete/{id}")
	  public  ResponseEntity<String>   removeActorById(@PathVariable  Integer id){
		  //use  service
		String msg=ActorService.deleteActorbyId(id);
		return  new  ResponseEntity<String>(msg,HttpStatus.OK);
	  }
	

}
