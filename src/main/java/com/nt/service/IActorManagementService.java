package com.nt.service;

import java.util.List;

import com.nt.Binding.ActorData;
public interface IActorManagementService
{

	public String registerActorInfo(ActorData Data);
	public List<ActorData> showAllActors();
	public ActorData showActorById(int id);
	public String updateActorData(ActorData Data);
	public String updateActorRemuneration(int aid,double amount);
	public String updateActorStatus(int aid, String status);
	public String deleteActorbyId(int aid);
		
	
}
