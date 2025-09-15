package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nt.Binding.ActorData;
import com.nt.entity.ActorInfoEntity;
import com.nt.repository.IActorInfoRepository;

@Service
public class ActorInfoManagementServiceImpl implements IActorManagementService{

	@Autowired
	private IActorInfoRepository actorRepo;
	
	@Value("${user.name}")
	private String osuser;
	
	@Override
	public String registerActorInfo(ActorData Data) {
		ActorInfoEntity entity=new ActorInfoEntity();
		BeanUtils.copyProperties(Data, entity);
		entity.setCreatedBy(osuser);//set the meta data to object entity
		entity.setUpdatedBy(osuser);
		int idVal=actorRepo.save(entity).getAid();
		return "Actor is saved with a Id value"+idVal;
	}
	
	@Override
	public List<ActorData> showAllActors()  {
	    List<ActorInfoEntity> listEntities = actorRepo.findAll();
	    
	    List<ActorData> listData = new ArrayList<>();
	    for (ActorInfoEntity entity : listEntities) {
	        ActorData data = new ActorData();
	        BeanUtils.copyProperties(entity, data);
	        listData.add(data);
	    }
	    
	    return listData;
	}

	@Override
	public ActorData showActorById(int id) {
		//using repo
		ActorInfoEntity entity=actorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid actor id"));
		//copy actor info entity data to entity class objects
		ActorData data=new ActorData();
		BeanUtils.copyProperties(entity, data);
		return data; 
	}

	@Override
	public String updateActorData(ActorData Data) {
	ActorInfoEntity entity=actorRepo.findById(Data.getAid()).orElseThrow(()->new IllegalArgumentException("invalid actor id"));;
		BeanUtils.copyProperties(Data, entity);
		entity.setUpdatedBy(osuser);
		//update object info;
		int idVal=actorRepo.save(entity).getAid();
		return idVal+" Actor Data is updated";
	}

	@Override
	public String updateActorRemuneration(int aid, double amount) {
		//using repo
		ActorInfoEntity entity=actorRepo.findById(aid).orElseThrow(()->new IllegalArgumentException("invalid actor id"));
		//modify entity obj
		entity.setRemuneration(amount);
		//update the object
		int idVal=actorRepo.save(entity).getAid();
		return idVal+" Actor Remuneration is updated";
	}

	@Override
	public String updateActorStatus(int aid, String status) {
		//use Repo
		ActorInfoEntity entity=actorRepo.findById(aid).orElseThrow(()->new IllegalArgumentException("invalid actor id"));
		//modify object
		entity.setActive_SW(status);
		//update object
		int idVal=actorRepo.save(entity).getAid();
		return idVal+" Actor Status is updated";
	}

	@SuppressWarnings("unused")
	@Override
	public String deleteActorbyId(int aid) {
		//use Repo
		ActorInfoEntity entity=actorRepo.findById(aid).orElseThrow(()->new IllegalArgumentException("invalid actor id"));
		//delete object
		actorRepo.deleteById(aid);
		return aid+" actor is deleted";
	}

	
}