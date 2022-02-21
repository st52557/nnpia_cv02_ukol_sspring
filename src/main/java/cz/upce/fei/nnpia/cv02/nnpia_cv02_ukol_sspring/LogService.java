package cz.upce.fei.nnpia.cv02.nnpia_cv02_ukol_sspring;

import org.springframework.stereotype.Service;

@Service
public class LogService {

    public LogService(){
        System.out.println("LogService created");
    }

    public void logActivity(String name, String activity){
        System.out.println("User "+ name + " did activity: "+ activity);
    }
}
