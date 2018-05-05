package hackqc18.Acclimate;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertesController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/alertes",produces="application/json")
    public String alertes(
            @RequestParam(value="nord", defaultValue="63.") double nord,
            @RequestParam(value="sud", defaultValue="40.") double sud,
            @RequestParam(value="est", defaultValue="-58.") double est,
            @RequestParam(value="ouest", defaultValue="-84.") double ouest) {
        return new Alertes(nord, sud, est, ouest).toString();
    }
}

