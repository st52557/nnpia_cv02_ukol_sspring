package cz.upce.fei.nnpia.cv02.nnpia_cv02_ukol_sspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogInService {

    @Autowired
    LogService logService;

    public void logIn(String name){
        logService.logActivity(name,"PRIHLASENI");
    }

}
