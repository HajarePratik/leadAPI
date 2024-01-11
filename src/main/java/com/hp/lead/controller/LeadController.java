package com.hp.lead.controller;

import com.hp.lead.dto.ResponseWrapper;
import com.hp.lead.entity.LeadEntity;
import com.hp.lead.service.LeadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lead")
public class LeadController {

    @Autowired
    LeadService leadService;

    @PostMapping("addlead")
    public ResponseEntity<ResponseWrapper> addLead(@Valid @RequestBody LeadEntity leadEntity) {
        return leadService.addLead(leadEntity);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<ResponseWrapper> getLeadById(@PathVariable int id) {
        return leadService.getLeadById(id);
    }

    @GetMapping("getByMobileNumber/{mobileNumber}")
    public ResponseEntity<ResponseWrapper> getLeadByMobileNumber(@PathVariable String mobileNumber) {
        return leadService.getLeadByMobileNumber(mobileNumber);
    }
}

