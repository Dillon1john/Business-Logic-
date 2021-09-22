package testarea;

import edu.citytech.cst.project.ds.BusinessLogic;
import org.junit.jupiter.api.Test;

public class TestBusinessLogic {
    @Test
    void e2() {

//        var service = new BusinessLogic("/data/filename.csv");
        var service = new BusinessLogic("student-exams.json");
        var avg = service.getAverage();
        var max = service.getMax();
        var min = service.getMin();
       var sum = service.getSum();

        System.out.println("Avg: "+avg);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Sum: "+sum);

    }
}
