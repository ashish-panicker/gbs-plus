package com.example.repository;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import com.example.model.Batch;

public class BatchRepositoryFileImpl implements BatchRepository {

    @Override
    public Batch save(Batch batch) {
        File dir = new File("batches");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File batchFile = new File(dir, "batch-" + batch.getName());

        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(batchFile))) {
            batch.setStatus("Created");
            objOut.writeObject(batch);
        } catch (Exception e) {
            batch = null;
            e.printStackTrace();
        }
        return batch;
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
