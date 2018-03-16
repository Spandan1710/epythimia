package edu.utdallas.restlayer;

import edu.utdallas.corelayer.BuyerService;
import edu.utdallas.corelayer.transferobjects.BuyerTO;
import edu.utdallas.restlayer.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @RequestMapping(method = RequestMethod.POST, path = "/register")
    @ResponseBody
    @CrossOrigin
    public Response registerBuyer(@RequestBody BuyerTO buyerTO){
        Response response = new Response();
        System.out.println(buyerTO);
        if(buyerService.registerBuyer(buyerTO)){
            response.setStatus(200);
            response.setMessage("Buyer Registered Successfully");
        }else{
            response.setStatus(417);
            response.setMessage("An Error Occurred");
        }
        return response;
    }

}
