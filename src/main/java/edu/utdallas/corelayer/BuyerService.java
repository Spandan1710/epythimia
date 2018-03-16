package edu.utdallas.corelayer;

import edu.utdallas.corelayer.transferobjects.BuyerTO;
import edu.utdallas.datalayer.dataaccess.BuyerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {

    @Autowired
    private BuyerDAO buyerDAO;

    public boolean registerBuyer(BuyerTO buyerTO){
        return buyerDAO.registerBuyer(buyerTO);
    }
}
