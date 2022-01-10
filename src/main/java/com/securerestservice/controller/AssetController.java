package com.securerestservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securerestservice.model.Asset;
import com.securerestservice.service.AssetService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class AssetController {
	
	@Autowired
	private AssetService assetService;
	
	@GetMapping("/assets")
	//@PreAuthorize("hasRole('ROLE_USER')")
    public List<Asset> getAllAssets() {
        return assetService.getAllAssets();
    }

    


}
