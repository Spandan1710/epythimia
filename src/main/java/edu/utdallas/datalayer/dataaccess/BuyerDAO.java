package edu.utdallas.datalayer.dataaccess;

import edu.utdallas.corelayer.transferobjects.BuyerTO;
import edu.utdallas.datalayer.entities.Buyer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BuyerDAO {

    @Autowired
    MongoTemplate mongoTemplate;


    public boolean registerBuyer(BuyerTO buyerTO){
        try{
            MongoOperations mop = (MongoOperations)mongoTemplate;
            Buyer buyer =  new Buyer();
            BeanUtils.copyProperties(buyerTO, buyer);
            System.out.println(buyer.toString());
            mop.insert(buyer);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


}
