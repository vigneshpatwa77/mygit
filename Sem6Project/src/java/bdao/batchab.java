/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdao;

import bmodel.batch;
import java.util.List;

/**
 *
 * @author windows
 */
public interface batchab {
    
     public List<batch> getAllBatch();

    public batch getBatchById(String b_id);

    public boolean addBatch(batch b);

    public boolean UpdateBatch(batch b);

    public boolean DeleteBatch(batch b);
}
