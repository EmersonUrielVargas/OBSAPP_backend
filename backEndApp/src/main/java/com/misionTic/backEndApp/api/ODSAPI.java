package com.misionTic.backEndApp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misionTic.backEndApp.dao.ODSDAO;
import com.misionTic.backEndApp.model.ODS;

@RestController
@RequestMapping("ods")
public class ODSAPI {
	
	@Autowired
	private ODSDAO odsDao;
	
	@GetMapping("/saveods")
	public ODS saveOds(@RequestBody ODS ods) {
		return odsDao.save(ods);
	}
	
	@GetMapping("/listODS")
	public List<ODS> listODS(){
		return odsDao.findAll();
	}
	

}
