package com.example.service;

import java.util.List;
import com.example.model.Batch;
import com.example.repository.BatchRepository;

public class BatchServiceImpl implements BatchService {

    private BatchRepository batchRepository;

    public BatchServiceImpl(BatchRepository batchRepository) {
        this.batchRepository = batchRepository;
    }

    @Override
    public Batch save(Batch batch) {
        return batchRepository.save(batch);
    }

    @Override
    public Batch findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Batch> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Batch t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }
}
