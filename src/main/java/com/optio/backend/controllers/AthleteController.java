/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optio.backend.controllers;

import com.optio.backend.models.Athlete;
import com.optio.backend.repositories.AthleteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sewmi
 */
@RestController
public class AthleteController {
    @Autowired
    AthleteRepository athleteRepository;
    
//     @RequestMapping(method=RequestMethod.POST,value="/athlete")
//     public String save(@RequestBody Athlete athlete){
//         athleteRepository.save(athlete);
//         return athlete.getId();
//     }
//      @RequestMapping(method=RequestMethod.GET,value="/athlete/{nic}")
//      public List<Athlete> show(@PathVariable String nic){
//          List<Athlete> getAthlete=(List<Athlete>) athleteRepository.findByNic(nic);
//          return getAthlete;
//      }
//      @RequestMapping(method=RequestMethod.GET,value="/athlete")
//      public List<Athlete> show(){
//            return athleteRepository.findAll();
//	}
      @RequestMapping(method=RequestMethod.GET,value="/getAthlete/{nic}")
      public Athlete  GetAthlete(@PathVariable String nic){
      Athlete ath= athleteRepository.findByNic(nic);
           return ath;           
          }
     //        for (int i = 0; i<Athletearr.length;i++){
//            System.out.println("data"+Athletearr[i]);
//               }

    //@RequestMapping(method=RequestMethod.GET,value="/athlete/{nic}")
     
       
     
     
     
//     public List<Athlete> show(@PathVariable String nic){
//                List<Athlete> athlete=(List<Athlete>) athleteRepository.findByNic(nic);
//		return athlete;
//	}
//    @RequestMapping(method=RequestMethod.GET,value="/athlete")
//     public List<Athlete> show(){
//               return athleteRepository.findAll();
//           
//    }
//      @RequestMapping(method=RequestMethod.GET,value="/athlete/{nic}")
//      public  List<Athlete> GetUserData(@PathVariable String nic){
//         List<Athlete> athleteList=show();
//      
//      String[] AthleteDataArr=new String[athleteList.size()];
//     
//          for (int i = 0; i<AthleteDataArr.length;i++){
//              System.out.println("data"+AthleteDataArr[i]);
//             
//          }
//      return athleteList;
////      
//     }
        
        
 
}