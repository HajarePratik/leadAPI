package com.hp.lead.service;

import com.hp.lead.dto.ResponseWrapper;
import com.hp.lead.entity.LeadEntity;
import com.hp.lead.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LeadService {

    @Autowired
    LeadRepository repository;

    public ResponseEntity<ResponseWrapper> addLead(LeadEntity leadEntity) {
        try {
            repository.save(leadEntity);
            return new ResponseEntity<>(new ResponseWrapper("success", "Created Leads Successfully"), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ResponseWrapper("error", "Bad Request"), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<ResponseWrapper> getLeadById(int id) {
        try {
            repository.findById(id);
            return new ResponseEntity<>(new ResponseWrapper("found", repository.findById(id)), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ResponseWrapper("error", "Record not found"), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<ResponseWrapper> getLeadByMobileNumber(String mobileNumber) {
        try {
            repository.findByMobileNumber(mobileNumber);
            return new ResponseEntity<>(new ResponseWrapper("found", repository.findByMobileNumber(mobileNumber)), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ResponseWrapper("error", "Record not found"), HttpStatus.BAD_REQUEST);
    }
}
