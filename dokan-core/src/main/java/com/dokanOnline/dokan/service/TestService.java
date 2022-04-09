package com.dokanOnline.dokan.service;

import com.dokanOnline.dokan.entity.OnlyEntityTest;
import com.dokanOnline.dokan.repository.OnlyTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private OnlyTestRepository onlyTestRepository;

    @Autowired
    TestService(OnlyTestRepository onlyTestRepository){
        this.onlyTestRepository = onlyTestRepository;
    }

    public List<OnlyEntityTest> getAll(){
        return (List<OnlyEntityTest>) onlyTestRepository.findAll();
    }
}
